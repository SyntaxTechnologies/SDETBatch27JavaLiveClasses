package org.example.class13;

import java.util.ArrayList;
import java.util.HashMap;

public class E4 {
    static void main() {

        HashMap<String,Integer> fruitPrices=new HashMap<>();
        fruitPrices.put("apple",10);
        fruitPrices.put("orange",20);
        fruitPrices.put("pear",30);
        fruitPrices.put("kiwi",40);

        HashMap<String,Integer> vegetablePrices=new HashMap<>();
        vegetablePrices.put("Potato",10);
        vegetablePrices.put("Onion",20);
        vegetablePrices.put("Cabbage",30);



        ArrayList<HashMap<String,Integer>> itemPriceList=new ArrayList();
        itemPriceList.add(fruitPrices);
        itemPriceList.add(vegetablePrices);

        System.out.println(itemPriceList);


    }
}
