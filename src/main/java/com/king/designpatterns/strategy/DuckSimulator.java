package com.king.designpatterns.strategy;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();

        Duck rubberDuck = new RubberDuck();

        mallardDuck.performFly();
        mallardDuck.performQuack();

        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();
    }
}
