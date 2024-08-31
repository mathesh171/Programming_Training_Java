/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal  substring  consisting of non-space characters only.

 
Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.


*/

import java.util.*;
public class Count_last_word
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		String str=x.nextLine();
		char arr[]=str.toCharArray();
		int len=arr.length-1,count=0;
		while(arr[len]==' '){
		    len--;
		    if(len==-1){
		        break;
		    }
		}
		if(len>=0){
		for(int i=len;arr[i]!=' ';--i){
		    count++;
		    if(i==0){
		        break;
		    }
		}}
		System.out.print(count);
	}
}
