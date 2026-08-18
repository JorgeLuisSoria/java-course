package com.devtalles.project.files;

import com.devtalles.project.base.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonWriterReaderList {

    private static final String SOURCE_FILE = "person.json";
    private static final String OUTPUT_FILE = "people.json";
    private static final Gson gson = new Gson();

    public static void main(String[] args) {
        List<Person> people = readPeople(SOURCE_FILE);
        printPeople(people);

        people.add(new Person("Alejandro Rafael", 32, true));
        writePeople(OUTPUT_FILE, people);

        List<Person> updatedPeople = readPeople(OUTPUT_FILE);
        printPeople(updatedPeople);
    }

    private static List<Person> readPeople(String filePath) {
        Type listType = new TypeToken<List<Person>>() {}.getType();
        try (FileReader reader = new FileReader(filePath)) {
            List<Person> people = gson.fromJson(reader, listType);
            return people != null ? people : new ArrayList<>();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    private static void writePeople(String filePath, List<Person> people) {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(people, writer);
            System.out.println("People written");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printPeople(List<Person> people) {
        for (Person p : people) {
            System.out.println("Name: " + p.getName());
            System.out.println("Age: " + p.getAge());
            System.out.println("Is Student: " + p.isStudent());
            System.out.println("=================================");
        }
    }
}
