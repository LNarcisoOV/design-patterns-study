package com.designpatterns.creational.factory.contract;

public class PartTime implements Contract {

    @Override
    public String getType() {
        return Constants.PART_TIME;
    }

}
