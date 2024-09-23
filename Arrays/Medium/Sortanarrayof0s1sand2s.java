package Arrays.Medium;

import java.util.Scanner;

public class Sortanarrayof0s1sand2s {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();

        int []arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        sort(arr,n);
            for(int i=0;i<n;i++){
                System.out.println(arr[i]);
            }
    }
    public static void sort(int []arr,int n){
        int onecount =0;
        int twocount = 0;
        int zerocount =0;
        for(int i=0;i<n;i++){
            if(arr[i]==1) onecount++;
            else if (arr[i]==2) twocount++;
            else zerocount++;
        }
        int i=0;
        while(zerocount>0){
            arr[i]=0;
                    i++;
                    zerocount--;
        }
        while(onecount>0){
            arr[i]=1;
            i++;
            onecount--;
        }
        while(twocount>0){
            arr[i]=2;
            i++;
            twocount--;
        }
    }
}
