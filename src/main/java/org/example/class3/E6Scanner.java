package org.example.class3;

import java.util.Scanner;

public class E6Scanner {
    static void main() {

        // used to take the input from the keyboard
        Scanner scanner=new Scanner(System.in);
        // This line of code is going to activate
        // the keyboard for int type of variable
        int age=scanner.nextInt();
        // This line of code is going to print the value of age
        System.out.println("My Age is "+age);

    }
}
