package com.labour.plugins;

import com.labour.plugins.labourResult.LabourReulstPlugin;

public class LabourPluginFactory {

    public static LabourReulstPlugin create(String classPath) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName(classPath);
        return (LabourReulstPlugin) clazz.newInstance();
    }

}
