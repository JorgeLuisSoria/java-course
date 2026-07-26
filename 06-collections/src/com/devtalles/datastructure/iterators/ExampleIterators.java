package com.devtalles.datastructure.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIterators {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("MacBook Pro");
        names.add("Tablet");
        names.add("Desktop");

        /*for(String name : names){
            System.out.println(name);
        }*/

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("M")) {
                iterator.remove();
            }
        }

        System.out.println(names);

    }
}
