package org.example.class2;

/*
Take age as input:

≥ 60 → "Senior Citizen"
≥ 18 → "Adult"
≥ 13 → "Teenager"
Else → "Child"
 */
public class P4 {
    static void main() {

        int age = 25;

        if (age >= 60) {
            System.out.println("Senior Citizen");
        } else if (age >= 18) {
            System.out.println("Adult");
        } else if (age >= 13) {
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }

    }
}
