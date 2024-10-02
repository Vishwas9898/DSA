package Arrays.Medium;

import java.util.ArrayList;
import java.util.Scanner;

public class SpiralMatrix {

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
        spiralMatrix(arr, n, m);

    }
    public static void spiralMatrix(int [][]arr,int n,int m){
        int top=0;int left =0;
        int right = m-1;int bottom =n-1;
        ArrayList<Integer> ans= new ArrayList<>();
        while(top <=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ans.add(arr[top][i]);
            }
            top++;
            if(left<=right){
                for(int i=top;i<=bottom;i++){
                    ans.add(arr[i][right]);
                }
                right--;
            }

            if(top<=bottom){
                for(int i=right; i<=left ;i--){
                    ans.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(right<=left){
                for(int i=bottom;i<=top;i--){
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
    }
}
