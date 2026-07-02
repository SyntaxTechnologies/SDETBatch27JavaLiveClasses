package org.example.class12;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class E25 {
    static void main() {

        Map<String,Integer> itemPrices = new TreeMap<>();
        itemPrices.put("Apple",10);
        itemPrices.put("Orange",20);
        itemPrices.put("Mango", 30);
        itemPrices.put("Banana",40);
        itemPrices.put("Watermelon",50);
        itemPrices.put("Pineapple",60);

        Map<String,Integer> itemPrices2 = new TreeMap<>();
        itemPrices2.put("Soap",10);
        itemPrices2.put("potato",20);
        itemPrices2.put("onions",45);


        ArrayList<Map<String,Integer>> list = new ArrayList<>();
        list.add(itemPrices);
        list.add(itemPrices2);

        System.out.println(list);
    }
}
