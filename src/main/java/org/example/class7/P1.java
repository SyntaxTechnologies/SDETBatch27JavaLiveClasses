package org.example.class7;
/*
1. Add a Word
Create a StringBuilder with "Hello".
Use append() to add " World".
Print the result.
Expected Output:
Hello World
 */
public class P1 {
    static void main() {
        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
    }
}
