/*
Niven Numbers: Numbers that are divisible by the sum of their digits. For example, 1, 2, 3, 4, 5, 6, 12, 18, ...
*/
import java.util.Scanner;

public class Niven_range
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		int b=x.nextInt();
		for(int i=a;i<=b;i++){
		int temp=i,sum=0;
		while(temp>0){
		    sum+=(temp%10);
		    temp/=10;
		}
		if(i%sum ==0){
		    System.out.print(i+" ");
		}
		}
	}
}
