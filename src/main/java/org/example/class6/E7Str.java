package org.example.class6;

public class E7Str {
    static void main() {

        String s="8AS738234bjhsjdfbjw873SBDSJHD@#^$#*";

        System.out.println(s);
        System.out.println(s.replaceAll("[A-Z]","*"));
        System.out.println(s.replaceAll("[0-9]","#"));
        System.out.println(s.replaceAll("[a-z]","@"));
        System.out.println(s.replaceAll("[A-Za-z0-9]","@"));
        System.out.println(s.replaceAll("[^A-Za-z0-9]","@"));




    }
}
