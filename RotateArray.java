/*
Get an array input and intger.provide the output array.
Input
5
1 2 3 4 5 
3
Output
4 5 1 2 3
*/

import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), arr[] = new int[n];
		for(int i=0;i<n;i++) arr[i] = sc.nextInt();
		int tar = sc.nextInt(), temp = tar;
		for(int i=0;i<n-tar;i++){
            int j,last;
            last = arr[n-1];
            for(j = n-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
		System.out.println(Arrays.toString(arr));
    }
}
