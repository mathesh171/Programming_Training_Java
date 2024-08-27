/*
Repunit Numbers: Numbers consisting of repeated units of 1. For example, 1, 11, 111, 1111, …
*/
import java.util.Scanner;

public class Repunit
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
	    int b=0;
		for(int i=0;i<a;i++){
		    b=(b*10)+1;
		    System.out.println(b);
		}
	}
}
