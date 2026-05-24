package org.example.class5;

/*
Print Numbers in Rows
Use nested for loops to print:
123
123
123
 */

public class P8 {
    static void main() {



        for (int i = 0; i < 3; i++) {
            for(int j=1;j<=3;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
