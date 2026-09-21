package com.king.designpatterns.strategy;

public class Quack implements QuackBehavior {
    private final String duckType;

    public Quack(String duckType) {
        this.duckType = duckType;
    }

    @Override
    public void quack() {
        System.out.println(duckType + " is quacking");
    }
}
