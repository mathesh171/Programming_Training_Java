/*
Spiral Pattern Clockwise (1 to 25): 
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int n=5,x=1;
		int minr=0,minc=0,maxr=n-1,maxc=n-1;
		int[][] a=new int[n][n];
		while(x<=n*n){
		    for(int i=minc;i<=maxc;i++){
		        a[minr][i]=x++;
		    }
		    minr++;
		    for(int i=minr;i<=maxr;i++){
		        a[i][maxc]=x++;
		    }
		    maxc--;
		    for(int i=maxc;i>=minc;i--){
		        a[maxr][i]=x++;
		    }
		    maxr--;
		    for(int i=maxr;i>=minr;i--){
		        a[i][minc]=x++;
		    }
		    minc++;
		    
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        int g=a[i][j],c=0;
		        while(g>0){
		            c++;
		            g/=10;
		        }if(c%2==0)
		        System.out.print(a[i][j]+"  ");
		        else
		        System.out.print(" "+a[i][j]+"  ");
		    }
		    System.out.println();
		}

	}
}
