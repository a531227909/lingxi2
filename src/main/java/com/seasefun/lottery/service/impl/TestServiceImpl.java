package com.seasefun.lottery.service.impl;

import com.seasefun.lottery.dao.TestDao;
import com.seasefun.lottery.entity.Result;
import com.seasefun.lottery.entity.TestUser;
import com.seasefun.lottery.plugins.LotteryPluginFactory;
import com.seasefun.lottery.plugins.lotteryResult.LotteryReulstPlugin;
import com.seasefun.lottery.service.TestService;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Service;
import com.seasefun.lottery.plugins.Plugin;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl extends ApplicationObjectSupport implements TestService {

    @Resource
    private TestDao testDao;

    @Override
    public Result testdoLogin(String account_id) {
        Result result = new Result();
        String msg = "test";
        String code = "1";
        TestUser data = testDao.testSelect(account_id);
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    @Override
    public Result testLottery() {
        Result result = new Result();
        String payChannel = "testlottery1";
        List<String> classPaths = getClassPathByPayChannel(payChannel);
        try {
            for(String classPath : classPaths){
                LotteryReulstPlugin lotteryReulstPlugin = LotteryPluginFactory.create(classPath);
                result = lotteryReulstPlugin.hanld();
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

    private List<String> getClassPathByPayChannel(String lotteryChannel){
        List<String> classPaths = new ArrayList<>();
        Map<String, Object> beans = getApplicationContext()
                .getBeansWithAnnotation(Plugin.class);
        if (beans != null && beans.size() > 0) {
            Collection<Object> values = beans.values();
            for (Object e : values) {
                if (e instanceof LotteryReulstPlugin) {
                    LotteryReulstPlugin plugin = (LotteryReulstPlugin) e;
                    Class<? extends LotteryReulstPlugin> cls = plugin.getClass();
                    Plugin annotation = cls.getAnnotation(Plugin.class);
                    if (annotation != null) {
                        String lotteryType = annotation.lotteryType();
                        if (!StringUtils.isEmpty(lotteryType)) {
                            if(lotteryType.equals(lotteryChannel)){
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
