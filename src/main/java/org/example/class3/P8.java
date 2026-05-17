package org.example.class3;

/*
3. Grade System
Steps
Declare char variable grade.
Assign value manually.
Use switch(grade).
Print:
A → Excellent
B → Good
C → Average
D → Poor
Default → "Invalid grade"
 */

public class P8 {
    static void main() {
        char grade='B';

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
