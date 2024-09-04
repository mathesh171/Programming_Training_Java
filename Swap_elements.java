/*
Swap Main Diagonal and Secondary Diagonal Elements

Write a program to swap the elements on the main diagonal with those on the secondary diagonal in a square matrix.

Sample Input:
1 2 3
4 5 6
7 8 9
Sample Output:
3 2 1
4 5 6
9 8 7

*/

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int temp = m[i][i];
            m[i][i] = m[i][n - 1 - i];
            m[i][n - 1 - i] = temp;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}

