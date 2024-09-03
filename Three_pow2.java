/*
Find the number is the power of three
i.e.
3,9,27,81...

*/

import java.util.*;
public class Three_pow2
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int temp=n,sum=0;
   while(temp>0){
       sum+=(temp%10);
       temp/=10;
   }
   if(sum%9 ==0 || sum ==3)
   System.out.println(n+" is a power of 3");
   else
   System.out.println(n+" is not a power of 3");
   

}
}
