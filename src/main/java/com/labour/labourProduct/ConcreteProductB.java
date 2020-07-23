package com.labour.labourProduct;

import com.labour.entity.LabourSource;

public class ConcreteProductB extends LabourProduct {
    @Override
    public LabourSource method() {
        LabourSource a = new LabourSource();
        a.setresult("我是产品B");
        a.setsource("产品B是我");
        a.setissue("BBBBB");
        return a;
    }
}