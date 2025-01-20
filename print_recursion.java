// print 5 times using recursion

import java.util.*;
public class Main
{
	public static void print(int a) {
		if (a>0) {
			System.out.println("Mathesh");
			print(a-1);
		}
	}
	public static void main(String[] args) {
		print(5);
	}
}
