package Sorting;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int []arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
       MergeSort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void MergeSort(int [] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        MergeSort(arr,start,mid);
        MergeSort(arr,mid+1,end);

        Merge(arr,start,mid,end);
    }
    public static void Merge(int []arr,int start,int mid,int end){
        int left =start;
        int right = mid+1;
       ArrayList<Integer> temp = new ArrayList<Integer>();

        while(left<= mid && right<=end){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right ++;
            }
        }
        while(left<= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= end){
            temp.add(arr[right]);
            right++;
        }
        for(int j=start ;j<=end;j++){
            arr[j]= temp.get(j-start);
        }
    }
}
