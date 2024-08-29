/*
Our Chef has some students in his coding class who are practicing problems. Given the difficulty of the problems that the students have solved in order, help the Chef identify if they are solving them in non-decreasing order of difficulty.

Non-decreasing means that the values in an array is either increasing or remaining the same, but not decreasing. That is, the students should not solve a problem with difficulty d1 ,and then later a problem with difficulty d2, where  d 1 ​ >d 2 ​ . Output “Yes” if the problems are attempted in non-decreasing order of difficulty rating and “No” if not. 

Input Format :

The first line of input will contain a single integer  T, denoting the number of test cases.
The description of the test cases follows. Each test case consists of 2 lines of input. 
The first line contains a single integer N , the number of problems solved by the students.
The second line contains N space-separated integers, the difficulty ratings of the problems attempted by the students in order.

Output Format :

For each test case, output in a new line “Yes” if the problems are attempted in non-decreasing order of difficulty rating and “No” if not. The output should be printed without the quotes. 

Each letter of the output may be printed in either lowercase or uppercase. For example, the strings yes, YeS, and YES will all be treated as equivalent. 

Constraints:
1≤T≤100
2 ≤ N ≤ 100
1≤ difficulty of each problem ≤ 5000 


Test Case 01:

Input:
2
3
1 2 3
5
1000 2000 5000 3000 1000

Output:
Yes
No

Test Case 02:

Input:
2
3
1 1 2
5
100 200 300 400 350

Output:
Yes
No

*/

import java.util.Scanner;
public class Increasing_order
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		int res[]=new int[a];
		for(int k=0; k<a; k++) {
			int n=x.nextInt(),flag=0;
			int arr[]=new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=x.nextInt();
				if(i>0) {
					if(arr[i]<arr[i-1]) {
						flag=1;
					}
				}
			}
			if(flag==1) {
				res[k]=1;
			} else {
				res[k]=0;
			}
		}

		for(int h:res) {
			if(h==1) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}
