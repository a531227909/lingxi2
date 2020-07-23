package com.labour.concreteFactory;

import com.labour.lotteryProduct.LotteryProduct;

public abstract class Factory {
    public abstract <T extends LotteryProduct> T createProduct(Class<T> cls);
}