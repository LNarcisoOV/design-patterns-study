package com.designpatterns.creational.singleton;

public class Singleton1Main {

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance("VALUE");
        singleton1.showValue();

        singleton1 = Singleton1.getInstance("VALUE 2");
        singleton1.showValue();
    }
}
