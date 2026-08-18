package com.devtalles.project.base;

import com.google.gson.Gson;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Esteban", 3, true);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);

        // json = "{\"name\":\"Esteban\",\"age\":3,\"student\":true}";
        String jsonReceived = """
               {
                    "name": "Francisco",
                    "age": 0,
                    "student": true
               }
               """;
        Person person2 = gson.fromJson(jsonReceived, Person.class);
        System.out.println(person2);
    }
}