/*
Oneful Pairs

Chef defines a pair of positive integers (a,b)  to be a Oneful PairOneful Pair, if

a+b+(a⋅b)=111 

For example, (1,55)  is a Oneful PairOneful Pair, since 1+55+(1⋅55)=56+55=111.
But (1,56)  is not a Oneful PairOneful Pair, since 1+56+(1⋅56)=57+56=113≠111.

Given two positive integers a  and b , output Yes if they are a Oneful PairOneful Pair. And No otherwise.

Input Format:

The only line of input contains two space-separated integers a  and b .

Output Format:

Output Yes, if (a,b)  form a Oneful PairOneful Pair. Output No if they do not.

*/

import java.util.Scanner;

public class Oneful_Pairs
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
	    int b=x.nextInt();
	    int c=a+b+(a*b),flag=0;
	    while(c>0){
	        if(c%10==1){
	            c/=10;
	            
	        }else{
	            flag=1;
	            break;
	        }
	    }
	    if(flag==0){
	        System.out.println("Yes");
	    }else{
	        System.out.println("No");
	    }
		
	}
}
