package com.devtalles.project.task.persistence;

import com.devtalles.project.task.model.Task;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class TaskPersistence {

    private final static String FILED_PATH = "tasks.json";
    private final static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void saveTasks(List<Task> tasks) {
        try (Writer writer = new FileWriter(FILED_PATH)) {
            gson.toJson(tasks, writer);
        } catch (IOException e) {
            System.out.println("Error writing tasks to file: " + e.getMessage());
        }
    }

    public static List<Task> loadTasks() {
        File file = new File(FILED_PATH);
        if (!file.exists()) {
            return new ArrayList<>();
        }
        try (Reader reader = new FileReader(file)) {
            Type listType = new TypeToken<List<Task>>() {}.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return new ArrayList<>();
        }
    }

}
