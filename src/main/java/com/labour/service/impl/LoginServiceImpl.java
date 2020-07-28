package com.labour.service.impl;

import com.labour.dao.LoginDao;
import com.labour.entity.Result;
import com.labour.entity.User;
import com.labour.plugins.LabourPluginFactory;
import com.labour.plugins.Plugin;
import com.labour.plugins.labourResult.LabourReulstPlugin;
import com.labour.service.LoginService;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class LoginServiceImpl extends ApplicationObjectSupport implements LoginService {

    @Resource
    private LoginDao loginDao;

    @Override
    public Result doLogin(String user_id) {
        Result result = new Result();
        String msg = "test";
        String code = "1";
        User data = loginDao.selectUser(user_id);
        System.out.println(data);
        result.setCode(code);
        result.setMsg(msg);
        result.setDatas(data);
        return result;
    }

    @Override
    public Result testLabour() {
        Result result = new Result();
        String payChannel = "testlabour1";
        List<String> classPaths = getClassPathByPayChannel(payChannel);
        try {
            for(String classPath : classPaths){
                LabourReulstPlugin labourReulstPlugin = LabourPluginFactory.create(classPath);
                result = labourReulstPlugin.hanld();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return result;
    }

    private List<String> getClassPathByPayChannel(String labourChannel){
        List<String> classPaths = new ArrayList<>();
        Map<String, Object> beans = getApplicationContext()
                .getBeansWithAnnotation(Plugin.class);
        if (beans != null && beans.size() > 0) {
            Collection<Object> values = beans.values();
            for (Object e : values) {
                if (e instanceof LabourReulstPlugin) {
                    LabourReulstPlugin plugin = (LabourReulstPlugin) e;
                    Class<? extends LabourReulstPlugin> cls = plugin.getClass();
                    Plugin annotation = cls.getAnnotation(Plugin.class);
                    if (annotation != null) {
                        String labourType = annotation.labourType();
                        if (!StringUtils.isEmpty(labourType)) {
                            if(labourType.equals(labourChannel)){
                                classPaths.add(cls.getName());
                            }
                        }
                    }
                }
            }
        }
        return classPaths;
    }

}
