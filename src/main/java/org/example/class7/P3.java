package org.example.class7;
/*
deleteCharAt() Practice Questions
1. Remove One Letter
Create:
Javva
Remove the extra v.
Expected Output:
Java
 */
public class P3 {
    static void main() {
        StringBuilder sb=new StringBuilder("Javva");
        sb.deleteCharAt(2);
        System.out.println(sb);

    }
}
