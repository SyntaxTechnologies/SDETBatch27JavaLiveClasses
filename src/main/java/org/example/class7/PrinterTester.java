package org.example.class7;

public class PrinterTester {
    static void main() {

        Printer p1= new Printer();
        p1.print();
        p1.printWord("Java");
        p1.printWord("Python");
        p1.printTwoWords("Java","Python");
    }
}
