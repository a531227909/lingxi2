package com.seasefun.lottery.concreteFactory;

import com.seasefun.lottery.lotteryProduct.LotteryProduct;

public abstract class Factory {
    public abstract <T extends LotteryProduct> T createProduct(Class<T> cls);
}