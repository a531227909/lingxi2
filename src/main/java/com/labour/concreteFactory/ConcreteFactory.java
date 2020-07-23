package com.labour.concreteFactory;


import com.labour.lotteryProduct.LotteryProduct;

public class ConcreteFactory extends Factory {
    //利用反射的方式更简洁地来生产具体的产品对象，需要在工厂方法的参数列表中传入一个class类来决定是那个产品类
    @Override
    public <T extends LotteryProduct> T createProduct(Class<T> cls) {
        LotteryProduct p = null;
        try {
            p = (LotteryProduct) Class.forName(cls.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T) p;
    }
}