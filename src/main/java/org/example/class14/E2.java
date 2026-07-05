package org.example.class14;

public class E2 {
    static void main() {


        try{
            //int [] arr=new int[-100];
           // String name=null;
           // name.length();
           /* String str="a";
            str.charAt(10);
            */
            int[] ar=new int[3];
            System.out.println(ar[10]);
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException Block Was executed");
        }
        catch (NegativeArraySizeException e){
            System.out.println("NegativeArraySizeException Block Was executed");
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException Block Was executed");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }
    }
}
