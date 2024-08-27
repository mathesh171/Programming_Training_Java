/*
Pronic Number Program  : A number is said to be a pronic number if product of two consecutive integers is equal to the number, is called a pronic number. 
Example- 42 is said to be a pronic number, 42=6×7, here 6 and 7 are consecutive integers
*/

import java.util.Scanner;

public class Pronic_Number
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		int flag=0;
		
		for(int i=1;i<a;i++){
		    if(i*(i+1)==a){
		        flag++;
		        break;
		    }
		}
		if(flag==1){
		    System.out.println(a+" is a Pronic Number");
		}else{
		    System.out.println(a+" is not a Pronic Number");
		}
	}
}
