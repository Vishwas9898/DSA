package Arrays.Hard;

import java.util.Scanner;

public class nby3majoritey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = majority(arr, n);

        System.out.println(res);

    }
    public static int majority(int []arr,int n){
       int el1= 0;
       int el2=0;
       int count1 =0;
       int count2 =0;
       for(int i=0;i<n;i++){

       }
       return el1;
    }
}
