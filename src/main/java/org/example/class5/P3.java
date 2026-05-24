package org.example.class5;
/*
Count Positive Numbers
Create an array containing positive and negative integers.
Use an enhanced for loop to count how many positive numbers are present.
 */
public class P3 {
    static void main() {

        int [] numbers={10,-20,33,40,55,60,-33,-4};
        int count=0;
        for (int num:numbers){
            if(num<0){
                count++;
            }
        }
        System.out.println("There are "+count+" positive numbers in the Array");
    }
}
