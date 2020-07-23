package com.labour.labourProduct;

import com.labour.entity.LabourSource;

public class ConcreteProductA extends LabourProduct {
    @Override
    public LabourSource method() {
        LabourSource a = new LabourSource();
        a.setresult("我是产品A");
        a.setsource("产品A是我");
        a.setissue("AAAAA");
        return a;
    }
}