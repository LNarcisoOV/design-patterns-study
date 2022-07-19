package com.designpatterns.creational.factory.contract;

public class FullTime implements Contract {

    @Override
    public String getType() {
        return Constants.FULL_TIME;
    }

}
