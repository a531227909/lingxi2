package com.seasefun.lottery.plugins.lotteryResult.testLotteryTow;

import com.seasefun.lottery.entity.Result;
import com.seasefun.lottery.plugins.Plugin;
import com.seasefun.lottery.plugins.lotteryResult.AbstractLotteryResultPlugin;
import com.seasefun.lottery.plugins.lotteryResult.MethodMapper;

@Plugin(lotteryType = "testlottery2")
public class TestLotteryTowPlugin extends AbstractLotteryResultPlugin {

    @MethodMapper(type = "testDoLottery1",name = "testDoLottery3")
    private Result excuteTestLottery(){
        System.out.println("excuteTestDoLottery2");
        Result result = new Result();
        String msg = "test";
        String code = "1";
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
