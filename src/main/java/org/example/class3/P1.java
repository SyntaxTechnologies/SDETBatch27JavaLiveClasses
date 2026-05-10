package org.example.class3;
/*
If age is greater than 18:
Print "Person is an adult"
Inside that:
If the person has a license → print "Can drive"
Else → print "Cannot drive without license"
 */
public class P1 {
    static void main() {

        int age=20;
        boolean hasLicense=true;
        if(age>18){

            if(hasLicense){
                System.out.println("Can drive");
            }else{
                System.out.println("Cannot drive without license");
            }

        }

    }
}


