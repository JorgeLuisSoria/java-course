package com.devtalles.datastructure.maps;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {

    public static void main(String[] args) {
        Map<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Laptop", 1000);
        productPrices.put("Tablet", 650);
        productPrices.put("Smartphone", 850);

        System.out.println(productPrices);

        System.out.println("This is the price for the laptop " + productPrices.get("Laptop"));

    }

}
