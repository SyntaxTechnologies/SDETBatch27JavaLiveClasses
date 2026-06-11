package org.example.project1;
/*
Find the Largest Number in the array
 */
public class E1 {
    static void main() {
        int [] values={300,88,30,40,50,77,76,990,300,5,8,7};

        int largest=values[2];
        for(int v:values){

            if(v>largest){

                largest=v;
            }
        }

        System.out.println("The largest value is "+largest);

    }
}
