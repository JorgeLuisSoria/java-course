package com.devtalles.datastructure.list.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleLinkedHashSet {

    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<Integer>();
        // Adding elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println(numbers);

    }

}
