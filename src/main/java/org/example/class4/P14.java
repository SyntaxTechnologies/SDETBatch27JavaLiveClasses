package org.example.class4;
/*
print  Numbers greater than 10
Store 6 numbers in an array and print numbers greater than 10 in the array.
{10,3,5,30,44,55,90}
 */
public class P14 {
    static void main() {

        int [] numbers={10,3,5,30,44,55,90};

        for (int i=0;i<numbers.length;i++){

            if(numbers[i]>10){
                System.out.println(numbers[i]);
            }
        }
    }
}
