package com.king.designpatterns.strategy;

public class QuackNoWay implements QuackBehavior {
    private final String duckType;

    public QuackNoWay(String duckType) {
        this.duckType = duckType;
    }

    @Override
    public void quack() {
        System.out.println(duckType + " cannot quack. << Silence >>");
    };
}
