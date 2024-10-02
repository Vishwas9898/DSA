package Arrays.Medium;

import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       NextPermutation(arr, n);

    }
    public static void NextPermutation(int []arr,int n){
        int el = -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                el=i;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

    }
}
