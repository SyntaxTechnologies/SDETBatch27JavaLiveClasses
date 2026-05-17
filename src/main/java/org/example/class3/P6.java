package org.example.class3;
/*
1. Check Scholarship Eligibility
Steps
Declare an integer variable for marks.
Declare a boolean variable for sports participation.
Store values in both variables.
Use logical OR operator ||.
Check:
If marks are greater than or equal to 85 or student is a sports player
If true, print "Eligible for scholarship".
Otherwise, print "Not eligible".
 */
public class P6 {
    static void main() {
        int marks=90;
        boolean isSportsPlayer=true;
        if(marks>85||isSportsPlayer){
            System.out.println("Eligible for scholarship");
        }else {
            System.out.println("Not eligible");
        }


    }
}
