package org.example.project1;
/*
3. Create an array to store the scores of six students in a class.
Use a loop to count and print
how many scores are above 80.
 */
public class Q3 {
    static void main() {

        double [] scores={60,90,85,76,88,92};
        int counter=0;
        for(double score:scores){

            if(score>80){
                counter++;
            }

        }

        System.out.println(counter);
    }
}
