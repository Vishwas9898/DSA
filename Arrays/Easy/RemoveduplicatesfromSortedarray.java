package Arrays.Easy;

import java.util.Scanner;

public class RemoveduplicatesfromSortedarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int []arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int res = RemoveDups(arr,n);
for(int i=0;i<res;i++) {
    System.out.println(arr[i]);
}
    }
    public static int RemoveDups(int[] arr,int n){
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
