package Arrays.Medium;

import java.util.Scanner;

public class Rotate90deg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int d = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();
        }
        rotate(arr, n, m);

    }
    public static void rotate(int [][]arr,int n,int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int temp =arr[i][j];
                arr[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[i][n-(j-1)];
                arr[i][n-(j-1)]=temp;
            }
        }
    }
}
