package com.seasefun.lottery.plugins.lotteryResult.testLottery;

import com.seasefun.lottery.entity.Result;
import com.seasefun.lottery.plugins.Plugin;
import com.seasefun.lottery.plugins.lotteryResult.AbstractLotteryResultPlugin;
import com.seasefun.lottery.plugins.lotteryResult.MethodMapper;

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
