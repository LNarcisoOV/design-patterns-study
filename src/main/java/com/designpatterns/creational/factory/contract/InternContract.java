package com.designpatterns.creational.factory.contract;

public class InternContract implements Contract {

    @Override
    public String getType() {
        return Constants.INTERN_CONTRACT;
    }

}
