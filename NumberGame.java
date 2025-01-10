/*
Assume you are the big boss, and you need to choose the house captain for this week, but in a mathematical way with some sieving techniques applied.




You have given the contestants a number starting at one and asked them to stand in increasing order.




THE GAME BEGINS RIGHT NOW!




In the first round, starting from left to right, remove the first number and every alternate number till the end of the list.




In the second round, repeat the previous step again, but this time, from right to left, remove the rightmost number and every alternate number from the list.




Keep repeating the steps again, alternating from left to right and from right to left, until only one number remains.




Given the integer n, which represents the number of housemates, write a code to return the number of the contestant who lasts in this and is going to be the house captain this week.




Example




Input:


n = 9


Output:


6


Explanation:


arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]


arr = [2, 4, 6, 8]


arr = [2, 6]


arr = [6]


Input format :

The input consists of an integer representing the number of housemates n.


Output format :

The output prints an integer, representing the number of the contestant who will be the week's captain.




Refer to the sample output for formatting specifications.


Code constraints :

1 ≤ n ≤ 200


Sample test cases :

Input 1 :

9

Output 1 :

6

Input 2 :

15

Output 2 :

8

*/

import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
ArrayList<Integer> arr = new ArrayList<Integer>();
int n = sc.nextInt(),a = 0;
for(int i=2;i<=n;i+=2) arr.add(i);
        while(arr.size()>1){
            if(a==0){
                for(int i=arr.size()-1;i>=0;i-=2) arr.remove(i);
                a=1;
            }
           
            if(arr.size()==1) break;
           
            if(a==1){
                if(arr.size()%2 == 0){
                    for(int i=0;i<arr.size();i+=2) arr.remove(i);
                }else{
                    for(int i=arr.size()-1;i>=0;i-=2) arr.remove(i);
                }
                a=0;
            }
        }
System.out.println(arr.get(0));
}
}
