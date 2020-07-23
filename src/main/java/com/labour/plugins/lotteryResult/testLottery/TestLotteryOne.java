package com.labour.plugins.lotteryResult.testLottery;

import com.labour.entity.Result;
import com.labour.plugins.Plugin;
import com.labour.plugins.lotteryResult.AbstractLotteryResultPlugin;
import com.labour.plugins.lotteryResult.MethodMapper;

@Plugin(lotteryType = "testlottery1")
public class TestLotteryOne extends AbstractLotteryResultPlugin {

    @MethodMapper(type = "testDoLottery1",name = "testDoLottery1")
    private Result excuteTestLottery(){
        System.out.println("excuteTestDoLottery1");
        Result result = new Result();
        String msg = "test";
        String code = "1";
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
