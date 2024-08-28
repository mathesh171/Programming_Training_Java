/*
Write a program to find the intersection of two arrays
*/

import java.util.Scanner;

public class Intersection_array
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n1=x.nextInt();
		int arr1[]=new int[n1];
		for(int i=0;i<n1;i++){
		    arr1[i]=x.nextInt();
		}
		int n2=x.nextInt();
		int arr2[]=new int[n2];
		for(int i=0;i<n2;i++){
		    arr2[i]=x.nextInt();
		}
		
		int m;
		if(n1>n2)
		m=n1;
		else
		m=n2;
		int arr3[]=new int[m],n=0;
		for(int i=0;i<n1;i++){
		    for(int j=0;j<n2;j++){
		     if(arr1[i]==arr2[j]){
		         arr3[n++]=arr1[i];
		     }   
		    }
		}
		for(int i=0;arr3[i]!='\0';i++){
		    System.out.print(arr3[i]+" ");
		}
	}
}
