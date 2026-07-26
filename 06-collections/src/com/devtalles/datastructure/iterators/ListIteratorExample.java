package com.devtalles.datastructure.iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Gabriel", "Fernando", "Maria"));
        System.out.println(names);
        addName(names, "Daniel");
        readNames(names);
        updateName(names, "Gabriel", "Ana");
        readNames(names);
        removeName(names, "Maria");
        System.out.println("names: "  + names);
    }

    public static void addName(List<String> namesList, String nameToAdd) {
        ListIterator<String> iterator = namesList.listIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (nameToAdd.equals("Gabriel")) {
                iterator.add(nameToAdd);
                break;
            }
        }

    }

    public static void updateName(List<String> nameList, String oldName, String newName) {
        ListIterator<String> iterator = nameList.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(oldName)) {
                iterator.set(newName);
                break;
            }
        }
    }

    public static void removeName(List<String> nameList, String nameToRemove) {
        ListIterator<String> iterator = nameList.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(nameToRemove)) {
                iterator.remove();
                break;
            }
        }
    }

    public static void readNames(List<String> namesList) {
        ListIterator<String> iterator = namesList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println(" ");
    }


}
