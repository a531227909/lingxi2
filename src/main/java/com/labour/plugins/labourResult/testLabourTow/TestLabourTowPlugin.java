package com.labour.plugins.labourResult.testLabourTow;

import com.labour.entity.Result;
import com.labour.plugins.Plugin;
import com.labour.plugins.labourResult.AbstractLabourResultPlugin;
import com.labour.plugins.labourResult.MethodMapper;

@Plugin(labourType = "testlabour2")
public class TestLabourTowPlugin extends AbstractLabourResultPlugin {

    @MethodMapper(type = "testDoLabour1",name = "testDoLabour3")
    private Result excuteTestLabour(){
        System.out.println("excuteTestDoLabour2");
        Result result = new Result();
        String msg = "test";
        String code = "1";
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
