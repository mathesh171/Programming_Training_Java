/*

Output:


1 5


Explanation:


The sum of elements from the 1st position to the 5th position is 15.


Input format :

The first line of input consists of the length of the array, N.


The second line of input consists of the sum of the sub-arrays to be searched, S.


The third line of input consists of N space-separated array elements.


Output format :

The output prints two space-separated integers, representing the start and end index positions of the subarray respectively whose sum is S.


If no such subarray exists, return an array consisting of element -1.


*/

import java.util.*;
public class Main
{
    public static int[] find(int arr[], int tar){
        int res[] = {-1,-1}, sum = 0,left=0;
        while(left<arr.length){
            for(int i=left;i<arr.length;i++){
                sum+=arr[i];
                if(sum==tar){
                    res[0] = left+1;
                    res[1] = i+1;
                    return res;
                }
            }
            left++;
            sum=0;
        }
        return res;
    }
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
int n = sc.nextInt(), arr[] = new int[n];
for(int i=0;i<n;i++) arr[i] = sc.nextInt();
int tar = sc.nextInt();
int res[] = find(arr,tar);
System.out.println("["+res[0]+","+res[1]+"]");
}
}
