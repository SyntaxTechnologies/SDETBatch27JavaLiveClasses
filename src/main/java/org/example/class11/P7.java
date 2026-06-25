package org.example.class11;

import java.util.ArrayList;

public class P7 {
    static void main() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int sum = 0;
        for (int i : numbers) {
            sum += i; // sum=sum+i
        }
        System.out.println(sum);

    }
}
