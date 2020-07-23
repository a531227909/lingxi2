package com.labour.lotteryProduct;

import com.labour.entity.LotterySource;

public class ConcreteProductA extends LotteryProduct {
    @Override
    public LotterySource method() {
        LotterySource a = new LotterySource();
        a.setresult("我是产品A");
        a.setsource("产品A是我");
        a.setissue("AAAAA");
        return a;
    }
}