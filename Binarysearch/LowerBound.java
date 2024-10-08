package Binarysearch;

import java.util.Scanner;

public class LowerBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d= sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = lowerBound(arr, n,d);

        System.out.println(res);
    }
    public static int lowerBound(int[]arr,int n,int d){
        int high =n-1;
        int low =0;
        int ans =0;
        while(high>=low){
            int mid = (high+low)/2;
            if(arr[mid]>=d){ans=mid; high =mid-1;}
            else {low = mid+1;}
        }
        return ans;
    }
}
