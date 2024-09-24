package Arrays.Medium;

import java.util.Scanner;

public class StockBuyorSell {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int []arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int res = MaxProfit(arr,n);

        System.out.println(res);

    }
    public static int MaxProfit(int []arr,int n){
        int min =Integer.MAX_VALUE;
        int MaxProfit =0;
        for(int i=0;i<n;i++){
            if(arr[i] < min){
                min =arr[i];
            }
            MaxProfit= Math.max(MaxProfit,arr[i]-min);
        }
        return MaxProfit;
    }
}
