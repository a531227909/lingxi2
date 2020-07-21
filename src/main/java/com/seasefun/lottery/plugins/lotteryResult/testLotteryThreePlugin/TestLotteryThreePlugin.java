package com.seasefun.lottery.plugins.lotteryResult.testLotteryThreePlugin;

import com.seasefun.lottery.entity.Result;
import com.seasefun.lottery.plugins.Plugin;
import com.seasefun.lottery.plugins.lotteryResult.AbstractLotteryResultPlugin;
import com.seasefun.lottery.plugins.lotteryResult.MethodMapper;

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
