/*
Get a number
Multiply its prime factors

Input
6
Output
6
Logic
Prime factors 2,3
ans 2 X 3 = 6
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), res = 1,tag = 0;
		for(int i=2;i<n;i++){
			if(n%i==0){
				tag = 0;
				for(int j=2;j<i;j++){
					if(i%j==0){
						tag=1;
						break;
					}
				}
				if(tag == 0) res*=i;
			}
		}
		System.out.println(res);
	}
}
