/*
Move Zeroes
Given an array nums, write a function to move all 0s to the end of it while maintaining the relative order of the non-zero elements.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0,0,1]
Output: [1,0,0]

*/
import java.util.Scanner;
public class Move_zeros
{
	public static void main(String[] args) {
	    Scanner x=new Scanner(System.in);
	    int n=x.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=x.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	            if(arr[i]==0){
	                arr[i]=arr[i]+arr[j];
	                arr[j]=arr[i]-arr[j];
	                arr[i]=arr[i]-arr[j];
	            }
	        }
	    }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
	    
	    
	}
}
