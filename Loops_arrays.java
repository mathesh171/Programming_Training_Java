/*
Chef loves integers that are in the range of l  to  r. More formally, Chef loves an integer x  if it satisfies the condition l ≤ x ≤ r. 
Chef has an array A  of length N. Currently, the happiness of the Chef is 0. He will examine the elements of the array in order from index 1 to N. If he finds an integer that he loves, his happiness will increase by 1; otherwise, his happiness will decrease by 1. 

Find the values of maximum and minimum happiness Chef will experience while going through the array. 

Input Format:

The first line of input will contain a single integer T, denoting the number of test cases. Each test case consists of multiple lines of input. 
The first line of each test case contains three integers N,l and r — the number of elements in the array, the least number that chef loves, the biggest number that chef loves.
The next contains N N space-separated integers, where the i th integer denotes A[i].

Output Format:

For each test case, output on a new line, two space-separated integers denoting the maximum and minimum happiness Chef will experience.

Test Case 01:

Input:
2
4 1 3
4 3 2 1
2 5 5
1 4

Output:
2 -1
0 -2

*/

import java.util.Scanner;
public class Loops_arrays
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int a=x.nextInt(),index=0;
		int result[]=new int[a*2];
		for(int m=0; m<a; m++) {
			int n=x.nextInt();
			int start=x.nextInt();
			int end=x.nextInt();
			int min=0,max=0;
			int arr[]=new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=x.nextInt();
				if(arr[i]>=start && arr[i]<=end) {
					max++;
				} else {
					min--;
				}
			}
			if(max+min > 0) {
				result[index++]= max+min;
			} else {
				result[index++]=max;
			}
			result[index++]=min;
			
		}
		index=0;
		for(int m=0;m<a;m++){
		    System.out.println(result[index++] +" "+ result[index++]);
		}
	}
}
