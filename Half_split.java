/*
Write a program to split an array and add the first half after the second half of the array. 
*/

import java.util.Scanner;

public class Half_split
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=x.nextInt();
		}
		for(int i=0;i<n/2;i++){
		    for(int j=0;j<n-1;j++){
		        arr[j]=arr[j]+arr[j+1];
		        arr[j+1]=arr[j]-arr[j+1];
		        arr[j]=arr[j]-arr[j+1];
		    }
		}


		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}



	}
}
