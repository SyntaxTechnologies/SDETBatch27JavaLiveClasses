package org.example.class11;

import java.util.ArrayList;

public class E8ArrayList {
    static void main() {

        ArrayList<Double> prices = new ArrayList<>();
        prices.add(10.5);
        prices.add(12.6);
        prices.add(0.5);
        prices.add(0.33);
        System.out.println(prices);
      //  prices.remove(12.6);
        prices.remove(1);
        System.out.println(prices);




    }
}
