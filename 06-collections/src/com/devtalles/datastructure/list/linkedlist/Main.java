package com.devtalles.datastructure.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> cities = new LinkedList<>();
        cities.add("Lima");
        cities.add("Arequipa");
        cities.add("Trujillo");

        ((LinkedList<String>)cities).addFirst("Quito");
        ((LinkedList<String>)cities).addFirst("Santiago");

        System.out.println(cities.get(2));

    }

}
