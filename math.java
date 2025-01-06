/*
Get a table value
Get a range value
create two variable 
1. to sum multiples of 4
2. to sum other value
provide the difference as output as positive integer

Input
5
5
Output
35
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int table = sc.nextInt(), range = sc.nextInt();
		int a = 0,b = 0;
		for(int i=1;i<=range;i++)
			((table*i)%4 == 0) ? a += n : b += n;
		System.out.println(Math.abs(a-b));
	}
}
