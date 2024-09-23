package Arrays.Easy;

import java.util.Scanner;

public class LeftRotatebyDplaces {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int d = sc.nextInt();
        int []arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        LeftRotate(arr,n ,d);

        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
    public static void LeftRotate(int []arr , int n, int d){
       d= d%n;
       int [] temp = new int[d];
       for(int i=0;i<d;i++){
           temp[i]= arr[i];
       }
       for(int i =d ;i<n;i++){
           arr[i-d] = arr[i];
       }
       for(int i = n-d;i<n;i++){
           arr[i] = temp[i-n+d];
       }
    }
}