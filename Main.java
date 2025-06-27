import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), arr[] = new int[n],res = 0;
		for(int i=0;i<n;i++) arr[i] = sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]!=-1 && arr[j]!=-1 && arr[i]<arr[j]){
					System.out.println(arr[j]-arr[i]);
					res+=(arr[j]-arr[i]);
					arr[i] = arr[j] = -1;
					break;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(res);
	}
}