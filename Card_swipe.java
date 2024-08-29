/*
In the bustling CodeChef office, the entrance is equipped with a high-tech card swipe system. Each employee is assigned a unique ID card that they use to swipe in and out of the building.

The system records every swipe, capturing the first swipe of an ID as in, second as out, third as in, and so on. Given an array A consisting of N IDs denoting N swipes throughout the day, find the maximum number of people in the office at any time.

Note that there is nobody inside the office before the first swipe.

Input Format:

The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of multiple lines of input.
	The first line of each test case contains an integer N — the number of swipes throughout the day.
	The next line contains N space-separated integers denoting the ID of the i th swipe.

Output Format:

For each test case, output on a new line, the maximum number of people in the office at any time.

Test Case 01:

Input:
4
4
1 2 2 1
4
1 1 1 2
5
3 5 2 4 1
5
1 2 1 5 4

Output:
2
2
5
3

*/

import java.util.Scanner;
public class Card_swipe
{
static int count() {
Scanner x = new Scanner(System.in);
int n=x.nextInt();
int max=0,c=0;
int[] arr=new int[n];
int[] arr1=new int[n];
for(int i=0; i<n; i++) {
arr[i]=x.nextInt();
}
for(int i=0; i<n; i++) {
for(int j=0; j<n; j++) {
if(i!=0 && arr1[j]!=-1) {
if(arr[i]==arr1[j]) {
arr1[j]=-1;
c--;
break;
}
else if(arr1[j]==0) {
arr1[j]=arr[i];
c++;
break;
}
}
else {
arr1[j]=arr[i];
c++;
break;
}
}
if(max<c) {
max=c;
}
}
return max;
}
public static void main(String[] args) {
Scanner x = new Scanner(System.in);
int n=x.nextInt();
int[] arr=new int[n];
for(int i=0; i<n; i++) {
arr[i]=count();
}
for(int h:arr) {
System.out.print(h+" ");
}
}
}
