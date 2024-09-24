package Arrays.Medium;

import java.util.*;

public class LeadersinanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> res = Leaders(arr, n);
    }

    public static ArrayList<Integer> Leaders(int[] arr, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int max = arr[n - 1];
        res.add(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                res.add(arr[i]);
                max = arr[i];
            }
        }
        return res;
    }
}
