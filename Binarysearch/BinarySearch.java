package Binarysearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d= sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = search(arr, n,d);

        System.out.println(res);
    }
    public static int search(int []arr,int n,int d){
      int low =0;
      int high = n-1;

      while(low<=high){
          int mid =(high+low)/2;
          if(arr[mid]==d)return mid;
          else if(arr[mid]>d) high = mid-1;
          else low =mid+1;
      }
      return -1;
    }
}
