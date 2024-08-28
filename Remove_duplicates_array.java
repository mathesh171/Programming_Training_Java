/*
Remove Duplicates from Sorted Array
*/

import java.util.Scanner;
public class Remove_duplicates_array
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int arr[]=new int[n];

		for(int i=0; i<n; i++) {
			arr[i]=x.nextInt();
		}
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[i]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}

		for(int i=0; i<n-1; i++) {
			if(arr[i]==arr[i+1]) {
				for(int j=i; j<n-1; j++) {
					arr[j]=arr[j+1];
				}
				arr[n-1]='\0';
				n--;
				i--;
			}

		}

		for(int m=0; m<n; m++) {
			System.out.print(arr[m]+" ");
		}


	}
}
