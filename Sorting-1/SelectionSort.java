import java.util.Scanner;

public class SelectionSort {
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
        for(int i=0;i<=arr.length-2;i++){
            int min = i;
            for(int j=i;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        return arr;
    }
    }
