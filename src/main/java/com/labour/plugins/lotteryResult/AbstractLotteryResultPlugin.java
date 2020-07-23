package com.labour.plugins.lotteryResult;

import com.labour.entity.Result;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AbstractLotteryResultPlugin implements LotteryReulstPlugin {

    protected String lotteryType;

    /**
     * 初始化必要参数
     */
    public void init(){
        lotteryType = "testDoLottery1";
    }

    public Result hanld() {
        init();
        MethodInfo payChannel = dispatcher();
        Result result = new Result();
        try {
            result = (Result) payChannel.getMethod().invoke(this);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }

    private MethodInfo dispatcher() {
        Class clazz = this.getClass();
        MethodInfo methodInfo = null;
        Method[] actionMethods = clazz.getDeclaredMethods();
        for (Method actionMethod : actionMethods) {
            actionMethod.setAccessible(true);
            if (actionMethod.isAnnotationPresent(MethodMapper.class)) {
                String lotteryType = actionMethod.getAnnotation(MethodMapper.class).type();
                String lotteryName = actionMethod.getAnnotation(MethodMapper.class).name();
                if (this.lotteryType.equals(lotteryType)) {
                    methodInfo = new MethodInfo();
                    methodInfo.setClazz(clazz);
                    methodInfo.setlotteryName(lotteryName);
                    methodInfo.setMethod(actionMethod);
                    break;
                }
            }
        }
        return methodInfo;
    }

}
