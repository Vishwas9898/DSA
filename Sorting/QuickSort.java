import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
           
            arr[idx]=sc.nextInt();
        }
        Sort(arr, 0, arr.length - 1);
        for (int idx = 0; idx < arr.length; idx++) {
           System.out.println(arr[idx]);
        }
    }
    public static void Sort(int []arr,int l , int r){
        if(l<r){
            int partition = Partition(arr,l,r);
            Sort(arr,l,partition-1);
            Sort(arr,partition,r);
        }
    }
    public static int Partition(int []arr,int l,int r){
     int pivot=arr[r];
     int i=l-1;
     for(int j=0;j<r;j++){
        if(arr[j]<=pivot){
            i++;
            int swapTemp = arr[i];
            arr[i] = arr[j];
            arr[j] = swapTemp;
        }
     }
     int swapTemp = arr[i+1];
     arr[i+1] = arr[r];
     arr[r] = swapTemp;
 
     return i+1;
    }
    }
