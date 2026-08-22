package com.devtalles.project.task;

import com.devtalles.project.task.Person;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PersonSaver {
    public static void main(String[] args) {
        Person person1 = new Person(
                "Fernando",
                Arrays.asList("Correr", "Jugar", "Estudiar"),
                true,
                14
        );
        Person person2 = new Person(
                "Esteban",
                Arrays.asList("Jugar", "Comer", "Practicar"),
                true,
                4
        );

        List<Person> persons = Arrays.asList(person1, person2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter fw = new FileWriter("person.json")) {
            gson.toJson(persons, fw);
            System.out.println("Person JSON SAVED");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
