package org.example.class14;

public class E3 {
    static void main() {


        System.out.println(1);
        try{
            System.out.println(2);
            int[] ar=new int[3];
            System.out.println(ar[10]);
            System.out.println(4);
        }
        catch(NullPointerException e)
        {
            System.out.println(5);
            System.out.println("NullPointerException Block Was executed");
        }
        catch (Exception e){
            System.out.println(6);
            System.out.println("Something went wrong");
        }
        System.out.println(7);
    }
}
