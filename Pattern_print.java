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
   int arr[][]=new int[n][n];
   int a=1;
   for(int j=0;j<n;j++){
   if(j%2 ==0){
       for(int i=j;i<n;i++){
           arr[i][j]=a++;
       }
   }else{
       for(int i=n-1;i>=j;i--){
           arr[i][j]=a++;
           
       }
   }
   }
   
   for(int i=0;i<n;i++){
       for(int j=0;j<=i;j++){
           System.out.print(arr[i][j]+" ");
       }
       System.out.println("");
   }

}
}
