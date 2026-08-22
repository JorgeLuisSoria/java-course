package com.devtalles.project.task;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class PersonLoader {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Type listType = new TypeToken<List<Person>>() {}.getType();
        try (FileReader fr = new FileReader("person.json")) {
            List<Person> persons = gson.fromJson(fr, listType);
            for (Person person : persons) {
                System.out.println(person);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
