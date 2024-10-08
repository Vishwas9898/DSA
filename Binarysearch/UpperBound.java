package Binarysearch;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = upperBound(arr, n, d);

        System.out.println(res);
    }
    public static int upperBound(int []arr,int n,int d){
        int high =n-1;
        int low=0;
        int ans= 0;
        while(low>=high){
            int mid=(high+low)/2;
            if(arr[mid]<=d){ans=mid;low=mid+1;}
            else high = mid-1;
        }
        return ans;
    }

}
