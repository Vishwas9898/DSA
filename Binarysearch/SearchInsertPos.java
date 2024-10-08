package Binarysearch;

import java.util.Scanner;

public class SearchInsertPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d= sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = insertPos(arr, n,d);

        System.out.println(res);
    }
    public static int insertPos(int []arr,int n,int d){
        int high = n-1;
        int low =0;
        int ans =0;
        while(low<=high){
            int mid =(high+low)/2;
            if(arr[mid]>=d){high=mid-1;ans = mid;}
            else low=mid+1;
        }
        return ans;
    }
}
