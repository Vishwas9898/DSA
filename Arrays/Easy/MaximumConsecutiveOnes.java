package Arrays.Easy;

import java.util.Scanner;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int []arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int res = MaxContinuosOnes(arr,n);

        System.out.println(res);

    }
    public static int MaxContinuosOnes(int []arr,int n){
        int count =0;
        int maxcount =0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                if(count>maxcount){
                    maxcount =count;
                }

            }
            else{
                count =0;
            }
        }
        return maxcount;
    }
}
