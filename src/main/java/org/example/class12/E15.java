package org.example.class12;

import java.util.Map;
import java.util.TreeMap;

public class E15 {
    static void main() {

        Map<String,Integer> itemPrices = new TreeMap<>();
        itemPrices.put("Apple",10);
        itemPrices.put("Orange",20);
        itemPrices.put("Mango", 30);
        itemPrices.put("Banana",40);
        itemPrices.put("Watermelon",50);
        itemPrices.put("Pineapple",60);
        System.out.println(itemPrices.get("Banana"));
        System.out.println(itemPrices.size());
        System.out.println(itemPrices.containsValue(25));
        System.out.println(itemPrices.containsKey("Apple"));
        System.out.println(itemPrices.containsKey("Kiwi"));

    }
}
