package com.devtalles.datastructure.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Ana");
        students.add("Gabriel");
        students.add("María");
        students.add("Fernando");

        System.out.println(students);
        System.out.println(students.get(1));
        System.out.println(students.remove(1));
        System.out.println(students);
        System.out.println(students.set(0, "Maximilian"));
        System.out.println(students);
        System.out.println(students.contains("Ana"));
    }
}
