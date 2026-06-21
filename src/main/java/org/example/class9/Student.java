package org.example.class9;

public class Student {
    String name;
    String rollNumber;

}

class GraduateStudent extends Student {
    String degree;

    void printInfo(){
        System.out.println(name+" "+rollNumber+" "+degree);
    }
}

class StudentTester extends Student {
    static void main() {
         GraduateStudent s1 = new GraduateStudent();
         s1.name="Muhammad";
         s1.rollNumber="12345";
         s1.degree="Computer Engineer";
         s1.printInfo();
    }
}
