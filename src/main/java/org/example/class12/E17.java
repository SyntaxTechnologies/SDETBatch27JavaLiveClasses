package org.example.class12;

import java.util.Map;
import java.util.TreeMap;

public class E17 {
    static void main() {

        Map<String,Integer> itemPrices = new TreeMap<>();
        itemPrices.put("Apple",10);
        itemPrices.put("Orange",20);
        itemPrices.put("Mango", 30);
        itemPrices.put("Banana",40);
        itemPrices.put("Watermelon",50);
        itemPrices.put("Pineapple",60);

        System.out.println(itemPrices.keySet());
        System.out.println(itemPrices.values());

    }
}
