package org.example.class3;

import java.util.Scanner;

public class E8Scanner {
    static void main() {

        // used to take the input from the keyboard
        Scanner scanner=new Scanner(System.in);
        // For one word use next method
        String name=scanner.nextLine();
        System.out.println("My Name is "+name);

    }
}
