//Sum of natural numbers using recursion
import java.util.*;
public class Main
{
    public static int sum(int a){
        if(a==1)
            return 1;
        else
            return a + (sum(a-1));
    }
	public static void main(String[] args) {
		System.out.println(sum(5)+" ");
	}
}
