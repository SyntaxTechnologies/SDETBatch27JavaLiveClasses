package org.example.class4;
/*
Count  Numbers greater than 10
Store 6 numbers in an array and count numbers greater than 10 in the array.
{10,3,5,30,44,55,90}
 */
public class P15 {
    static void main() {

        int [] numbers={10,3,5,30,44,55,90};

        int counter=0;

        for (int i=0;i<numbers.length;i++){

            if(numbers[i]>10){
               counter++;
            }
        }

        System.out.println(counter);
    }
}
