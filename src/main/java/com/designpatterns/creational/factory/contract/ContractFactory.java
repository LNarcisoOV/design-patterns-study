package com.designpatterns.creational.factory.contract;

public class ContractFactory {

    public Contract getContract(String type) {
        if (type.equals(Constants.FULL_TIME)) {
            return new FullTime();
        }

        if (type.equals(Constants.PART_TIME)) {
            return new PartTime();
        }

        if (type.equals(Constants.INTERN_CONTRACT)) {
            return new InternContract();
        }
        return null;
    }
}
