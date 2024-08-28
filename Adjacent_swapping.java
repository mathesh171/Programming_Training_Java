/*
Write a program to swap adjacent elements of a one dimensional array
Example :
Enter total number of elements: 10
Enter array elements:  10 20 30 40 50 60 70 80 90 100
Array elements after swapping adjacent elements: 20 10 40 30 60 50 80 70 100 90

*/

import java.util.Scanner;

public class Adjacent_swapping
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt(),j;
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=x.nextInt();
		}
		for(int i=0; i<n-1; i+=2) {
			arr[i]=arr[i]+arr[i+1];
			arr[i+1]=arr[i]-arr[i+1];
			arr[i]=arr[i]-arr[i+1];

		}

		for(int h:arr) {
			System.out.print(h+" ");
		}

	}
}
