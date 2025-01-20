import java.util.*;
public class Main
{
	public static int ArrayEvenSum(int a[], int len) {
		if(len>=0) {
			if(a[len]%2 == 0) return a[len] + ArrayEvenSum(a, --len);
			else return ArrayEvenSum(a, --len);
		}
        return 0;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println(ArrayEvenSum(arr, arr.length - 1));
	}
}
