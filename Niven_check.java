/*
Niven Numbers: Numbers that are divisible by the sum of their digits. For example, 1, 2, 3, 4, 5, 6, 12, 18, ...
*/

import java.util.Scanner;

public class Niven_check
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		int temp=a,sum=0;
		while(temp>0){
		    sum+=(temp%10);
		    temp/=10;
		}
		if(a%sum ==0){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
	}
}
