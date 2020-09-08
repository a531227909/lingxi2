package com.labour.plugins.labourResult.testLabourThreePlugin;

import com.labour.entity.Result;
import com.labour.plugins.Plugin;
import com.labour.plugins.labourResult.AbstractLabourResultPlugin;
import com.labour.plugins.labourResult.MethodMapper;

@Plugin(labourType = "testlabour1")
public class TestLabourThreePlugin extends AbstractLabourResultPlugin {

    @MethodMapper(type = "testDoLabour1",name = "testDoLabour2")
    private Result excuteTestLabour(){
        Result result = new Result();
        String msg = "test";
        String code = "2";
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
