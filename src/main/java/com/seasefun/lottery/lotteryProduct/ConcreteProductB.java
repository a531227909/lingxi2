package com.seasefun.lottery.lotteryProduct;

import com.seasefun.lottery.entity.LotterySource;

public class ConcreteProductB extends LotteryProduct {
    @Override
    public LotterySource method() {
        LotterySource a = new LotterySource();
        a.setresult("我是产品B");
        a.setsource("产品B是我");
        a.setissue("BBBBB");
        return a;
    }
}