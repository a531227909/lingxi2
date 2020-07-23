package com.labour.concreteFactory;

import com.labour.labourProduct.LabourProduct;

public abstract class Factory {
    public abstract <T extends LabourProduct> T createProduct(Class<T> cls);
}