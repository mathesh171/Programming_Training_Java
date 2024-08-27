/*
Neon Number Program : A neon number is a number where the sum of digits of square of the number is equal to the number.
For example if the input number is 9, its square is 9*9 = 81 and sum of the digits is 9. i.e. 9 is a neon number.
*/

import java.util.Scanner;

public class Neon
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		int temp=a*a,sum=0;
		while(temp>0){
		    sum+=(temp%10);
		    temp/=10;
		}
		if(a == sum){
		    System.out.println(a+" is a Neon Number");
		}else{
		    System.out.println(a+" is not a Neon Number");
		}
	}
}
