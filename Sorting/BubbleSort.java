import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
           
            arr[idx]=sc.nextInt();
        }
        arr=Sort(arr);
        for (int idx = 0; idx < arr.length; idx++) {
           System.out.println(arr[idx]);
        }
    }
    public static int[] Sort(int []arr){
        for(int i=arr.length-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    }
