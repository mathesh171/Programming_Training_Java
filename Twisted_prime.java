/*
Twisted Prime Program  : A number is called a twisted prime number if it is a prime number and the reverse of this number is also a prime number.
*/

import java.util.Scanner;

public class Twisted_prime
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		int temp=a,rev=0,flag=0;
		while(temp>0){
		    rev=(rev*10)+(temp%10);
		    temp/=10;
		}
		for(int i=2;i<rev;i++){
		    if(rev%i==0){
		        flag++;
		        break;
		    }
		}
		if(flag==0){
		    System.out.println(a+" is a Twisted prime");
		}else{
		    System.out.println(a+" is not a Twisted prime");
		}
	}
}
