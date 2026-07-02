package org.example.class12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class E13 {
    static void main() {

        Map<String,Integer> itemPrices = new LinkedHashMap<>();
        itemPrices.put("Apple",10);
        itemPrices.put("Orange",20);
        itemPrices.put("Mango",30);
        itemPrices.put("Banana",40);
        itemPrices.put("Watermelon",50);
        itemPrices.put("Pineapple",60);
        System.out.println(itemPrices);

    }
}
