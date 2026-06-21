package org.example.class9;

public class Calculator {
    void add(int a,int b){
        System.out.println(a+b);
    }

    void add(double a,double b){
        System.out.println(a+b);
    }

    void add(int a ,int b, int c){
        System.out.println(a+b+c);
    }


    void add(int a, double b){
        System.out.println(a+b);
    }

    void add( double b,int a){
        System.out.println(a+b);
    }

}

class CalculatorTester{
    static void main() {

        Calculator c = new Calculator();
        c.add(1.5,2);
        c.add(1,2);
        c.add(1,2,3);
    }
}