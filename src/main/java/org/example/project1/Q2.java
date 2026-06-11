package org.example.project1;
/*
2. Create an array of five integer values. After the array is created,
use a loop to calculate and
print the average of all the elements.
 */
public class Q2 {
    static void main() {


        int [] values={10,20,30,40,50};
        int sum=0;
        for(int v:values){
            sum=v+sum;
        }
        System.out.println(sum/values.length);

    }
}
