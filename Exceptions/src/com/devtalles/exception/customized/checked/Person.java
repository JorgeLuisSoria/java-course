package com.devtalles.exception.customized.checked;

public class Person {

    private Integer age;
    private String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public static Person createPerson(Integer age, String name) throws AgeValidationException {
        if (age < 18) {
            throw new AgeValidationException("You must be adult");
        }
        return new Person(age, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
