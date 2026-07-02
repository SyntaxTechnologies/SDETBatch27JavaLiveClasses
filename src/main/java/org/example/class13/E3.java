package org.example.class13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class E3 {
    static void main() {


        // Its a HashMap which contains Strings as keys
        // and Integers as values
        HashMap<String,Integer> fruitPrices=new HashMap<>();
        // First we are filling this map with some values
        fruitPrices.put("apple",10);
        fruitPrices.put("orange",20);
        fruitPrices.put("pear",30);
        fruitPrices.put("kiwi",40);
    /* The we are creating an arrayList and specify to Java that
    this time we are going to sore HashMaps inside ArrayList
     */

        ArrayList<HashMap<String,Integer>> itemPriceList=new ArrayList();
        itemPriceList.add(fruitPrices);

        System.out.println(itemPriceList);


    }
}
