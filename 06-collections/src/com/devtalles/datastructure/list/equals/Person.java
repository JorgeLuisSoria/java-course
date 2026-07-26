package com.devtalles.datastructure.list.equals;

import java.util.Objects;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Pedro");
        Person person2 = new Person("Daniel");
        System.out.println(person1.equals(person2));
    }
}
