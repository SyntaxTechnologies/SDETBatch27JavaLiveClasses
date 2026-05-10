package org.example.class3;

public class E4NIfElse {
    static void main() {


       boolean voteRegistered=false;
       int age=5;

       if(age>=18){

           if(voteRegistered==true){
               System.out.println("You can caste your vote");
           }else{
               System.out.println("You Need to register the vote");
           }

       }else{
           System.out.println("You Need to be 18 years old");
       }


    }
}
