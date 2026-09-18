package com.king.orderflow.design;

public class MallardDuck extends Duck {

    public MallardDuck(){
        super("Mallard Duck");
        FlyBehavior flyBehavior = new FlyWithWings("Mallard Duck");
        setFlyBehavior(flyBehavior);
        QuackBehavior quackBehavior = new Quack("Mallard Duck");
        setQuackBehavior(quackBehavior);
    }

    public void fly(){
        performFly();
    }

    public void quack(){
        performQuack();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck is seen");
    }
}
