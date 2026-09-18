package com.king.orderflow.design;

public class FlyWithWings implements FlyBehavior {
    private final String duckType;

    public FlyWithWings(String duckType) {
        this.duckType = duckType;
    }

    @Override
    public void fly() {
        System.out.println(duckType + " is flying");
    };
}
