package org.example.class10;

public class P1 {
    static void main() {
        int[] numbers = {5, 10, 15, 20};

        int sum=0;
        for(int n:numbers){
            sum=sum+n;
        }

        System.out.println(sum);
    }
}
