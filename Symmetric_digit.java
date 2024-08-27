/*
You are given two positive integers low and high.

An integer x consisting of 2 * n digits is symmetric if the sum of the first n digits of x is equal to the sum of the last n digits of x. Numbers with an odd number of digits are never symmetric.

Return the number of symmetric integers in the range [low, high].

 

Example 1:

Input: low = 1, high = 100
Output: 9
Explanation: There are 9 symmetric integers between 1 and 100: 11, 22, 33, 44, 55, 66, 77, 88, and 99.
Example 2:

Input: low = 1200, high = 1230
Output: 4
Explanation: There are 4 symmetric integers between 1200 and 1230: 1203, 1212, 1221, and 1230.
 

Constraints:

1 <= low <= high <= 104

*/

import java.util.Scanner;

public class Symmetric_digit {

	static int digitCount(int n) {
		int length=0,temp=n;
		while(temp>0) {
			length++;
			temp/=10;
		}
		return length;
	}

	static int symmetric(int m) {
		int sum1=0,sum2=0,num=m;
		int length=digitCount(m);
		int len=length;
		while(num>0) {
			if(len>(length/2)) {
				sum2+=(num%10);
				num/=10;
				len--;
			} else {
				sum1+=(num%10);
				num/=10;
				len--;
			}
		}
		if(sum1 == sum2)
			return 1;
		else
			return 0;
	}

	public static void main(String args[])
	{
		Scanner x= new Scanner(System.in);
		int low,high,count=0;
        low=x.nextInt();
        high=x.nextInt();
        for(int i=low;i<=high;i++){
            if(digitCount(i)%2 == 0){
                if(symmetric(i)==1){
                    count++;   
                }
            }
        }
        System.out.println(count);


	}
}
