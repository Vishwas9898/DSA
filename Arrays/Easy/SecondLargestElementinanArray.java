package Arrays.Easy;

import java.util.Scanner;

public class SecondLargestElementinanArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int []arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int res = SecondlargestElement(arr,n);

        System.out.println(res);

    }
    public static int SecondlargestElement(int [] arr,int n){
        int max = arr[0];
        int secmax = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>=max){
                secmax = max;
                max = arr[i];
            } else if (arr[i]>secmax ) {
                secmax = arr[i];
            }
        }
        return secmax;
    }
}
