package com.king.designpatterns.strategy;

public class RubberDuck extends Duck {

    public RubberDuck(){
        super("Rubber Duck");
        FlyBehavior flyBehavior = new FlyNoWay("Rubber Duck");
        setFlyBehavior(flyBehavior);
        QuackBehavior quackBehavior = new Squeak("Rubber Duck");
        setQuackBehavior(quackBehavior);
    }

    public void fly(){
        performFly(); // no fly
    }

    public void quack(){
        performQuack(); // squeak
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck is seen");
    }
}
