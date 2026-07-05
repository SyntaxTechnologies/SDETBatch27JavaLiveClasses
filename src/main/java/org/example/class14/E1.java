package org.example.class14;

public class E1 {
    static void main() {

        System.out.println("Opening browser");
        try {
            System.out.println("loading facebook.com");
           // DummyProblems.internetDown();
            System.out.println("logging into Facebook");
            System.out.println("clicking on share post");
            System.out.println("Uploading a the pic and the caption");
            System.out.println("clicking the share button");
        }
        catch (Exception e)
        {
            System.out.println("Internet is Down alert the QA");
        }
        System.out.println("Continue executing rest of the test cases");



    }
}
