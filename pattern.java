/*
input 
1 2 3 4 5 6
output
1 4 2 5 3 6

input
1 2 3 4 5 6 7
output
1 5 2 6 3 7 4
*/

import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        if(n%2==0){
            for(int i=n-1;i>=n/2;i--) st2.push(arr[i]);
            for(int i=(n/2)-1;i>=0;i--) st1.push(arr[i]);
        }else{
            for(int i=n-1;i>=(n/2)+1;i--) st2.push(arr[i]);
            for(int i=(n/2);i>=0;i--) st1.push(arr[i]);
        }
        for(int i=0;i<n;i++)
            arr[i] = (i%2==0)? st1.pop():st2.pop();
        System.out.println(Arrays.toString(arr));
        
    }
}
