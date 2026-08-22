package com.devtalles.project.task;

import java.util.List;

public class Person {
    private String name;
    private Integer age;
    private boolean isStudent;
    private String email;
    private List<String> hobbies;

    public Person(String name, List<String> hobbies, boolean isStudent, Integer age) {
        this.name = name;
        this.hobbies = hobbies;
        this.isStudent = isStudent;
        this.age = age;
    }

    public Person(String name, List<String> hobbies, String email, boolean isStudent, Integer age) {
        this.name = name;
        this.hobbies = hobbies;
        this.email = email;
        this.isStudent = isStudent;
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isStudent=" + isStudent +
                ", hobbies=" + hobbies +
                '}';
    }
}
