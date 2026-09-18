package com.king.orderflow.design;

public class FlyNoWay implements FlyBehavior {
    private final String duckType;

    public FlyNoWay(String duckType) {
        this.duckType = duckType;
    }

    @Override
    public void fly() {
        System.out.println(duckType + " cannot fly");
    };
}
