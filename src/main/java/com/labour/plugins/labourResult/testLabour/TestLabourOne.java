package com.labour.plugins.labourResult.testLabour;

import com.labour.entity.Result;
import com.labour.plugins.Plugin;
import com.labour.plugins.labourResult.AbstractLabourResultPlugin;
import com.labour.plugins.labourResult.MethodMapper;

@Plugin(labourType = "testlabour1")
public class TestLabourOne extends AbstractLabourResultPlugin {

    @MethodMapper(type = "testDoLabour1",name = "testDoLabour1")
    private Result excuteTestLabour(){
        Result result = new Result();
        String msg = "test";
        String code = "1";
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
