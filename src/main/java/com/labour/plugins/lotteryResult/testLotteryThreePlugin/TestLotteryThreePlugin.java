package com.labour.plugins.lotteryResult.testLotteryThreePlugin;

import com.labour.entity.Result;
import com.labour.plugins.Plugin;
import com.labour.plugins.lotteryResult.AbstractLotteryResultPlugin;
import com.labour.plugins.lotteryResult.MethodMapper;

@Plugin(lotteryType = "testlottery1")
public class TestLotteryThreePlugin extends AbstractLotteryResultPlugin {

    @MethodMapper(type = "testDoLottery1",name = "testDoLottery2")
    private Result excuteTestLottery(){
        System.out.println("excuteTestDoLottery3");
        Result result = new Result();
        String msg = "test";
        String code = "2";
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
