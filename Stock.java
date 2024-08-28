/*
Andrew is a stock trader who trades in N selected stocks. He has calculated the relative stock price changes in the N stocks from the previous day stock prices. Now, his lucky number is K, so he wishes to invest in the particular stock that has the Kth smallest relative stock value. (Mphasis)
Write an algorithm for Andrew to find the Kth smallest stock price out of the selected N stocks.
Input Format
First line of Input Integer N denotes the number of Selected stocks.
Second line of Input denotes the stock prices.
Third line of Input denotes the Integer K (to find the Kth smallest stock price out of the selected N stocks). 
Output Format
Print the Kth smallest stock price out of the selected N stocks.

Example:
Input:
5
10 5 7 88 19
3
Output:
10
Explanation:
The sorted relative stock prices are [5, 7, 10, 19, 88].
So, the 3rd smallest stock price is 10.

Test Case 1:
Input:
7
1 2 3 4 5 7 9
4
Output:
4

Test Case 2:
Input:
5
10 5 7 88 19
3
Output:
10

*/

import java.util.Scanner;
public class Stock
{
	public static void main(String[] args) {
	    Scanner x=new Scanner(System.in);
	    int n=x.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=x.nextInt();
	    }
	    int k=x.nextInt();
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<k;j++){
	            if(arr[j]<arr[i]){
	                arr[i]=arr[i]+arr[j];
	                arr[j]=arr[i]-arr[j];
	                arr[i]=arr[i]-arr[j];
	            }
	        }
	    }

	    System.out.println(arr[k-1]);
	    
	}
}
