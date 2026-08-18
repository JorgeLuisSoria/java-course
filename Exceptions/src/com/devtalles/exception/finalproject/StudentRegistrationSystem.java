package com.devtalles.exception.finalproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentRegistrationSystem {

    private List<Student> students;

    public StudentRegistrationSystem() {
        this.students = new ArrayList<>();
    }

    public void registerStudent(String name, int age, String id) throws DuplicateStudentException {
        validateStudentData(name, age, id);
        if (isRegisteredStudent(id)) {
            throw new DuplicateStudentException("You cannot register an existing student.");
        }
        this.students.add(new Student(name, age, id));
        System.out.println("Student with name " + name + " has been successfully registered");
    }

    public void removeStudent(String id) throws StudentNotFoundException {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be null or empty.");
        }
        Iterator<Student> iterator = this.students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId().equals(id)) {
                iterator.remove();
                System.out.println("Student with ID " + id + " has been removed");
                return;
            }
        }
        throw new StudentNotFoundException("The student with ID " + id + " was not found.");
    }

    public boolean isRegisteredStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void validateStudentData(String name, int age, String id) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Student name cannot be empty");
        }
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be empty");
        }
        if (age < 17 || age > 100) {
            throw new IllegalArgumentException("Student age must be between 0 and 100");
        }
        if (!id.matches("^[A-Z]\\d{5}$")) {
            throw new IllegalArgumentException("Student ID must contain alphanumeric characters");
        }
    }

    public static void main(String[] args) {
        StudentRegistrationSystem studentRegistrationSystem = new StudentRegistrationSystem();
        try {
            studentRegistrationSystem.registerStudent("Jorge Soria", 38, "A12345");
        } catch (Exception e) {
            System.out.println("Error: "  + e.getMessage());
        }

        try {
            studentRegistrationSystem.registerStudent("Jorge Soria", 12, "A12347");
        } catch (Exception e) {
            System.out.println("Error: "  + e.getMessage());
        }

        try {
            studentRegistrationSystem.registerStudent("Jorge Soria", 19, "AB12347");
        } catch (Exception e) {
            System.out.println("Error: "  + e.getMessage());
        }

        try {
            studentRegistrationSystem.registerStudent("Jorge Soria", 19, "A12345");
        } catch (Exception e) {
            System.out.println("Error: "  + e.getMessage());
        }
    }
}
