import java.util.*;
public class Main
{
    public static int ArraySum(int a[], int sum, int len){
        if(len>=0) return ArraySum(a, sum + a[len], --len);
        else return sum;
    }
	public static void main(String[] args) {
	    int arr[] = {1,2,3,4,5};
	    System.out.println(ArraySum(arr, 0, arr.length - 1));
	}
}
