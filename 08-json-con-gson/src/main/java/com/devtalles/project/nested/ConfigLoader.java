package com.devtalles.project.nested;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;

public class ConfigLoader {
    public static AppConfig loadConfig(String filePath) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileReader reader = new FileReader(filePath)) {
            return  gson.fromJson(reader, AppConfig.class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        AppConfig appConfig = loadConfig("config.json");
        if (appConfig != null) {
            System.out.println("App Name: " + appConfig.getAppName());
            System.out.println("App Version: " + appConfig.getVersion());
            System.out.println("App Theme: " + appConfig.getSettings().getTheme());
            System.out.println("App Notifications: " + appConfig.getSettings().isNotifications());
            System.out.println("App Language: " + appConfig.getSettings().getLanguage());
        }
    }
}
