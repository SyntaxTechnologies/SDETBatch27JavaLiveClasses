package org.example.class7;

public class MethodPractice {
    String joinWords(String word1,String word2){
        return word1+word2;
    }

    void printArray(int [] arr){
        for(int a:arr){
            System.out.println(a);
        }
    }

    int larger(int a, int b){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }

}
