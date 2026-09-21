package com.king.designpatterns.strategy;

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
