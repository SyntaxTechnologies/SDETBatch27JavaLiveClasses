package org.example.class4;
/*
Reverse an Array
Store 5 numbers in an array and print them in reverse order using a loop.
 */
public class P20 {
    static void main() {
        int [] ages={10,20,30,40,70,60,70,80,90,100};

        for (int i = ages.length-1; i >=0 ; i--) {
            System.out.println(ages[i]);
        }
    }
}
