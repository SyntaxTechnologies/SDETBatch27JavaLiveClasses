package org.example.class3;

import java.util.Scanner;

/*
3. Enter Age and Check Adult or Minor
Steps
Import the Scanner class.
Create a Scanner object.
Declare an integer variable for age.
Ask the user to enter age.
Store the input.
Use an if statement:
If age is 18 or more → print "Adult"
Else → print "Minor"
 */
public class P3 {
    static void main() {

        Scanner scanner=new Scanner(System.in);
        int age=scanner.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }else{
            System.out.println("Minor");
        }


    }
}
