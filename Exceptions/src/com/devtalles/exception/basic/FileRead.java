package com.devtalles.exception.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("src/example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("The file has been closed.");
                }
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }

    }
}
