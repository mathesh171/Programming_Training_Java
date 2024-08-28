/*
Write a program to find the first repeated element in an array
*/

import java.util.Scanner;

public class First_repeated_element
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt(),j;
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=x.nextInt();
		}
		for(int i=0; i<n; i++) {
			for(j=i+1; j<n; j++) {
				if(arr[j]==arr[i]) {
					System.out.println("First repeated element is "+arr[i]);
					break;
				}
			}
			if(arr[j]==arr[i]) {
				break;
			}
		}

	}
}
