package org.example.class11;
/*
Check if an Element Exists
Create an ArrayList<String> called subjects.
Add "Math", "Science", "English".
Check if "Math" exists using contains().
Print the result.
 */


import java.util.ArrayList;

public class P5 {
    static void main() {
        ArrayList<String> subjects = new ArrayList<String>();
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");
        System.out.println(subjects.contains("Math"));
    }
}
