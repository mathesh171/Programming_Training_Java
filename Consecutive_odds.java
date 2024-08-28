/*
Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.

Example 1:
Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.

Example 2:
Input: arr = [1,4,5,3,11,6,8,9]
Output: true
Explanation: There are  three consecutive odds 5,3,11.

Constraints:
1 <= arr.length <= 1000
1 <= arr[i] <= 1000

*/
import java.util.Scanner;
public class Consecutive_odds
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n=x.nextInt(),flag=0;
		int arr[]=new int[n];

		for(int i=0; i<n; i++) {
			arr[i]=x.nextInt();
		}
		for(int i=0; i<n; i++) {
			if(arr[i]%2 !=0) {
				flag++;
				if(flag==3) {
					System.out.println("True");
					break;
				}
			} else {
				flag=0;
			}
		}
		if(flag<3) {
			System.out.println("False");
		}
	}
}
