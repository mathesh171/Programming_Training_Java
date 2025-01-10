/*
Print The pattern
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/

import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt(),a = n;
for(int i=0;i<n;i++){
   for(int j=a;j>0;j--){
       System.out.print(j+" ");
   }
   System.out.println();
   a--;
}
}
}
