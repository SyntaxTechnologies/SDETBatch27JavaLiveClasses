package org.example.class3;

/*
Check if a Person Can Vote
Steps
Declare an integer variable for age.
Declare a boolean variable for citizenship.
Store values in both variables.
Use the logical AND operator &&.
Check:
If age is 18 or more and the person is a citizen
If true, print "Can vote".
 */

public class P4 {
    static void main() {

        int age = 20;
        boolean citizenship = true;
        if(age>=18 && citizenship){
            System.out.println("Can vote");
        }


    }

}
