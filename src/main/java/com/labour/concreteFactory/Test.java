package com.labour.concreteFactory;

import com.labour.lotteryProduct.LotteryProduct;
import com.labour.entity.LotterySource;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Factory factory = new ConcreteFactory();
        //需要哪个类的对象就传入那个类的类型即可，这种方式比较简洁、动态
        Class classN = Class.forName("com.labour.lotteryProduct.ConcreteProductB");
        LotteryProduct product = factory.createProduct(classN);
        LotterySource ls = product.method();
        System.out.println(ls.toString());
    }
}