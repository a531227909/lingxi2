package com.labour.service.impl;

import com.labour.dao.LoginDao;
import com.labour.entity.Result;
import com.labour.entity.User;
import com.labour.plugins.LabourPluginFactory;
import com.labour.plugins.Plugin;
import com.labour.plugins.labourResult.LabourReulstPlugin;
import com.labour.service.LoginService;
import com.labour.utils.Md5Utils;
import com.labour.utils.TokenUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    private static Logger logger = LogManager.getLogger("org.springframework");

    @Resource
    private LoginDao loginDao;

    @Override
    public Result doLogin(String user_name, String password, String ip) {
        Result result = new Result();
        User user = loginDao.selectUser(user_name);
        if(user ==null || "".equals(user)){
            result.setCode("1001");
            result.setMsg("账号不存在");
            return result;
        }
        if(Md5Utils.string2Md5(password).equals(user.getPassword())){
            String token = TokenUtils.token(user_name, password);
            user.setToken(token);
            user.setPassword("");
            result.setCode("1000");
            result.setMsg("登录成功");
            result.setDatas(user);
            logger.info("用户:"+user_name+"登陆成功  IP:"+ip);
        }else{
            result.setCode("1001");
            result.setMsg("您的账号或密码有误");
        }
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
