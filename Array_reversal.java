/*
Reverse an array
*/


import java.util.Scanner;
public class Array_reversal
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=x.nextInt();
		}
		int temp=n;
		for(int i=0;i<n/2;i++){
		    temp--;
		    arr[i]=arr[i]+arr[temp];
		    arr[temp]=arr[i]-arr[temp];
		    arr[i]=arr[i]-arr[temp];
		}
		for(int h:arr){
		    System.out.print(h+" ");
		}
	}
}
