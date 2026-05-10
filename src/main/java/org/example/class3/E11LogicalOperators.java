package org.example.class3;

public class E11LogicalOperators {
    static void main() {
        // Logical operators ! && ||

        boolean isSunday=true;
        boolean homeAlone=false;

        if(isSunday && homeAlone){
            System.out.println("Let's go to park");
        }else{
            System.out.println("Let's do something");
        }
    }
}
