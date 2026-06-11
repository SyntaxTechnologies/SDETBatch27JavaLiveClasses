package org.example.project1;

import java.util.Scanner;

/*
4. Write a program that takes two numbers as input and prints their sum, difference, product,
and division without using any extra variables for calculations.
 */
public class Q4 {
    static void main() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1=scanner.nextDouble();
        System.out.println("Enter the second number");
        double num2=scanner.nextDouble();
        System.out.println("Sum :"+(num1+num2));
        System.out.println("Difference :"+(num1-num2));
        System.out.println("product :"+(num1*num2));
        System.out.println("division :"+(num1/num2));

    }
}
