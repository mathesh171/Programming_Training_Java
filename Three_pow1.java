/*
Find the number is the power of three
i.e.
3,9,27,81...

*/

import java.util.*;
public class Three_pow1
{
    public static boolean pow3(int n){
        while(n>0){
       n/=3;
       if(n==1)
       return true;
   }
   return false;
    }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   if(pow3(n))
   System.out.println(n+" is a power of 3");
   else
   System.out.println(n+" is not a power of 3");
   

}
}
