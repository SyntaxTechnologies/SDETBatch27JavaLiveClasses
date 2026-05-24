package org.example.class5;
/*
Stop When Negative Number Appears
Create an array of integers. Use a loop to
print numbers until a negative number is found, then stop using break.
 */
public class P4 {
    static void main() {
        int [] numbers={10,-20,33,40,55,60,-33,-4};

        for (int num:numbers){
            if(num<0){
                break;
            }

            System.out.println(num);
        }

    }
}
