package com.labour.plugins.lotteryResult;

import java.lang.reflect.Method;

public class MethodInfo {
    private String lotteryName;
    private String lotteryType;
    private Class clazz;
    private Method method;

    public String getlotteryType() {
        return lotteryType;
    }

    public void setlotteryType(String lotteryType) {
        this.lotteryType = lotteryType;
    }

    public String getlotteryName() {
        return lotteryName;
    }

    public void setlotteryName(String lotteryName) {
        this.lotteryName = lotteryName;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }
}
