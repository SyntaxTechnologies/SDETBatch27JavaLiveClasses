package org.example.class4;

public class P19 {
    static void main() {

        char [] letters={'A','B','C','A','E','F','A','H'};
        int counter=0;
        for (int i=0;i<letters.length;i++) {
            if(letters[i]=='A'){
                counter++;
            }
        }
        System.out.println("Letter A Appeared "+counter);


    }
}
