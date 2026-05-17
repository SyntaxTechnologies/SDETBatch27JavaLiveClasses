package org.example.class4;

public class P18 {
    static void main() {

        int [] ages={10,20,30,40,70,60,70,80,90,100};

        boolean isPresent=false;

        for(int i=0;i<ages.length;i++){

            if(ages[i]==7){
                isPresent=true;
            }
        }

        if(isPresent){
            System.out.println("Number 7 is present");
        }else {
            System.out.println("Number 7 is not present");
        }


    }
}
