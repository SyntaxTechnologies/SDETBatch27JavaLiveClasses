package org.example.class3;
/*
Steps
Declare an integer variable choice.
Assign a value manually.
Use switch(choice).
Print based on selection:
1 → Burger
2 → Pizza
3 → Pasta
4 → Sandwich
5 → Fries
Default → "Invalid choice"
 */
public class P7 {
    static void main() {
        int choice=2;

        switch (choice){
            case 1:
                System.out.println("Burger");
                break;
            case 2:
                System.out.println("Pizza");
                break;
            case 3:
                System.out.println("Pasta");
                break;
            case 4:
                System.out.println("Sandwich");
                break;
            case 5:
                System.out.println("Fries");
                break;
            default:
                System.out.println("Invalid choice");}
    }
}
