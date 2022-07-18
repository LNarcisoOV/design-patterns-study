package com.designpatterns.creational.singleton;

public class Singleton1 {

    private static Singleton1 singleton1 = null;
    public String value;

    public Singleton1() {}

    private Singleton1(String value) {
        this.value = value;
    }

    public static Singleton1 getInstance(String value) {
        if (singleton1 == null) {
            singleton1 = new Singleton1(value);
        }
        return singleton1;
    }

    public void showValue() {
        System.out.println(value);
    }

}
