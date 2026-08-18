package com.devtalles.project.files;

import com.devtalles.project.base.Person;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonWriter {
    public static void main(String[] args) {
        /*Person person = new Person("Esteban", 3, true);
        Gson gson = new Gson();
        try (FileWriter fileWriter = new FileWriter("person.json")) {
            gson.toJson(person, fileWriter);
            System.out.println("The person was saved successfully");
        } catch (IOException e) {
            System.out.println("Error writing the file: "  + e.getMessage());
        }*/

        Gson gson = new Gson();
        try (FileReader reader = new FileReader("person.json")) {
            Person personJson = gson.fromJson(reader, Person.class);
            System.out.println(personJson);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main ended");
    }

}
