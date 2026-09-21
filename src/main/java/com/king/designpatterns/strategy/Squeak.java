package com.king.designpatterns.strategy;

public class Squeak implements QuackBehavior {
    private final String duckType;

    public Squeak(String duckType) {
        this.duckType = duckType;
    }

    @Override
    public void quack() {
        System.out.println(duckType + " squeaks");
    }
}
