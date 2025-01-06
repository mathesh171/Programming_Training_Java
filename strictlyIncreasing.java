/*
Given a 0-indexed integer array nums, return true if it can be made strictly increasing after removing exactly one element, or false otherwise. If the array is already strictly increasing, return true.

The array nums is strictly increasing if nums[i - 1] < nums[i] for each index i (1 <= i < nums.length).

Example 1:

Input:
5
1 2 10 5 7

Output:
true

Explanation: By removing 10 at index 2 from nums, it becomes [1, 2, 5, 7]. [1, 2, 5, 7] is strictly increasing, so return true.

Example 2:

Input:
4
2 3 1 2

Output:
false

Explanation:
[3, 1, 2]` is the result of removing the element at index `0`.
[2, 1, 2]` is the result of removing the element at index `1`.
[2, 3, 2]` is the result of removing the element at index `2`.
[2, 3, 1]` is the result of removing the element at index `3`.
No resulting array is strictly increasing, so return `false`.


*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), arr[] = new int[n], nums[] = new int[n-1],res=1;
		for(int i=0;i<n;i++) arr[i] = sc.nextInt();
		for(int i=0;i<n;i++){
			int m = 0;
			res = 1;
			for(int j=0;j<n;j++){
				if(j!=i) nums[m++] = arr[j];
			}
			for(int k=1;k<n-1;k++){
				if(nums[k-1]<nums[k]) res++;
			}
			if(res==n-1)break;
		}
		System.out.println((res==n || res == n-1)?"true":"false");
	}
}
