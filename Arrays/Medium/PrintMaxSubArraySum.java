package Arrays.Medium;

import java.util.Scanner;

public class PrintMaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();

        int []arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
maxsum(arr,n);


    }
    public static void maxsum(int [] arr,int n){
        int start =0;
        int ansst=-1;int ansend =-1;
        int sum=0;
        int maxsum=0;
        for(int i=0;i<n;i++){
            if(sum==0)start =i;
            sum+=arr[i];
            if(maxsum<sum)maxsum=sum;
            ansst =start;ansend = i;
            if(sum<0)sum =0;
        }
    }
}
