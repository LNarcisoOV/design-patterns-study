package com.designpatterns.creational.builder.person;

public class Person {

    private String name;
    private String lastName;
    private int age;

    private Person(String name, String lastName, int age) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    

    @Override
    public String toString() {
        return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age + "]";
    }

    public static class PersonBuilder {

        private String name;
        private String lastName;
        private int age;

        public PersonBuilder() {

        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(name, lastName, age);
        }
    }
}
