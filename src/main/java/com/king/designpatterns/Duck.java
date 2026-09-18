package com.king.orderflow.design;

public abstract class Duck {
    private final String duckType;
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(String duckType) {
        this.duckType = duckType;
    }

    public String getDuckType() {
        return duckType;
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println(duckType + " swims. All ducks float, even decoys!");
    }

    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }
}
