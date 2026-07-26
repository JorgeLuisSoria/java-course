package com.devtalles.datastructure.maps;

import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {

    public static void main(String[] args) {
        Map<String, Integer> productPrices = new TreeMap<>();
        productPrices.put("Lenovo ThinkPad", 1200);
        productPrices.put("Dell Inspiron 3240", 2500);
        productPrices.put("MacBook Pro", 3500);

        System.out.println(productPrices);

    }

}
