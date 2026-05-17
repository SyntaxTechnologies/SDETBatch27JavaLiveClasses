package org.example.class3;
/*
3. Check if a Number is Between 1 and 100
Steps
Declare an integer variable.
Store a number in it.
Use the logical AND operator &&.
Check:
If number is greater than 1
And less than 100
If true, print "Number is between 1 and 100".
Otherwise, print "Number is outside the range".
 */
public class P5 {
    static void main() {

        int number=20;

        if(number>1 && number<100){
            System.out.println("Number is between 1 and 100");
        }else{
            System.out.println("Number is outside the range");
        }

    }
}
