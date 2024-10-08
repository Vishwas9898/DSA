package Arrays.Hard;

import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Boolean res = threesum(arr, n,d);

        System.out.println(res);

    }
    public static Boolean threesum(int []arr,int n,int d){
        for(int i=0;i<=n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum == d) return true;
                else if(sum<d)j++;
                else k--;
            }
        }
        return false;
    }
}
