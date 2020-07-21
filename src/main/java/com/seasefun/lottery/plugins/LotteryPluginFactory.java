package com.seasefun.lottery.plugins;

import com.seasefun.lottery.plugins.lotteryResult.LotteryReulstPlugin;

public class LotteryPluginFactory {

    public static LotteryReulstPlugin create(String classPath) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName(classPath);
        return (LotteryReulstPlugin) clazz.newInstance();
    }

}
