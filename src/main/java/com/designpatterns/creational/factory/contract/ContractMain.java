package com.designpatterns.creational.factory.contract;

public class ContractMain {

    public static void main(String[] args) {
        ContractFactory contractFactory = new ContractFactory();
        
        Contract contract = contractFactory.getContract(Constants.FULL_TIME);

        System.out.println(contract.getType());

        contract = contractFactory.getContract(Constants.PART_TIME);

        System.out.println(contract.getType());

        contract = contractFactory.getContract(Constants.INTERN_CONTRACT);

        System.out.println(contract.getType());
    }

}
