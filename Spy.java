/*
Spy Number Pogram  : A spy number is a number where the sum of its digits equals the product of its digits.
For example, 1124 is a spy number, the sum of its digits is 1+1+2+4=8 and the product of its digits is 1*1*2*4=8.

*/

import java.util.Scanner;

public class Spy
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		int temp=a,sum=0,pro=1;
		while(temp>0){
		    sum+=(temp%10);
		    pro*=(temp%10);
		    temp/=10;
		}
		if(sum == pro){
		    System.out.println(a+" is a Spy Number");
		}else{
		    System.out.println(a+" is not a Spy Number");
		}
	}
}
