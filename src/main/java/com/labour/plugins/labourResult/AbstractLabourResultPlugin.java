package com.labour.plugins.labourResult;

import com.labour.entity.Result;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AbstractLabourResultPlugin implements LabourReulstPlugin {

    protected String labourType;

    /**
     * 初始化必要参数
     */
    public void init(){
        labourType = "testDoLabour1";
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
                String labourType = actionMethod.getAnnotation(MethodMapper.class).type();
                String labourName = actionMethod.getAnnotation(MethodMapper.class).name();
                if (this.labourType.equals(labourType)) {
                    methodInfo = new MethodInfo();
                    methodInfo.setClazz(clazz);
                    methodInfo.setLabourName(labourName);
                    methodInfo.setMethod(actionMethod);
                    break;
                }
            }
        }
        return methodInfo;
    }

}
