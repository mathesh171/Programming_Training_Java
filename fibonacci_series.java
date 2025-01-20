import java.util.*;
public class Main
{
    public static void sum(int a, int s, int e){
        System.out.print(s+" ");
        if(a>1)sum(--a,e,s+e);
        
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		sum(sc.nextInt(),0,1);
	}
}
