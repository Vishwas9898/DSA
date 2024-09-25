package Arrays.Medium;

import java.util.Scanner;

public class Countsubarrayswithgivensum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int d = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = count(arr, n,d);

        System.out.println(res);
    }
    public static int count(int [] arr,int n,int d){
        int count =0;
        int left =0;
        int right =0;
        int sum = arr[0];
        while(right<n){
            while(sum >d){
                sum -=arr[left];
                left++;
            }
            if(sum==d){
                count++;
            }
            right++;
            if(right<n) sum+=arr[right];
        }
        return count;
    }
}
