package com.devtalles.project;

import com.google.gson.Gson;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Esteban", 3, true);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}