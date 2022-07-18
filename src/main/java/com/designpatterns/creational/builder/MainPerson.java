package com.designpatterns.creational.builder;

public class MainPerson {

    public static void main(String... args) {
        Person person = new Person.PersonBuilder()
                .name("John")
                .lastName("Doe")
                .age(34)
                .build();
        
        System.out.println(person.toString());
    }
}
