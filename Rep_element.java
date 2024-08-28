/*

Element Appearing More Than 25% In Sorted Array
Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time,
return that integer. 

Example 1:
Input: arr = [1,2,2,6,6,6,6,7,10]
Output:6

Example 2:
Input: arr = [5,4,2,5,8,5,6,9,5,3,5,2]
Output:5

*/

import java.util.Scanner;
public class Rep_element
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		float flag=0;
		int arr[]=new int[n];

		for(int i=0; i<n; i++) {
			arr[i]=x.nextInt();
		}
		for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	            if(arr[j]<arr[i]){
	                arr[i]=arr[i]+arr[j];
	                arr[j]=arr[i]-arr[j];
	                arr[i]=arr[i]-arr[j];
	            }
	        }
	    }
	    int c=0;
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	            if(arr[i]==arr[j]){
	                flag++;
	            }
	        }
	       
	        if(flag>((float)n*0.25)){
	            System.out.println(arr[i]);
	            c=1;
	            break;
	        }
	        
	    }
	    if(c==0){
	        System.out.println("No such element exist");
	    }
	}
}
