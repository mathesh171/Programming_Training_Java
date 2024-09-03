/*
Print the pattern

1
2 9
3 8 10 
4 7 11 14 
5 6 12 13 15
*/

import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int temp=0;
   for(int i=0;i<n;i++){
       for(int j=0;j<=i;j++){
           if(j==0){
               temp=(i+1);
           }
           else if(j%2 == 0 && j!=0){
               temp+=((i-j)*2)+2;
           }else{
               temp+=((n-i)*2)-1;
           }
           System.out.print(temp +" ");
       }
       System.out.println("");
   }
   

}
}
