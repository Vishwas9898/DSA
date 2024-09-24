package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSumProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean res = Twosum(arr, n, d);

        System.out.println(res);

    }

    public static boolean Twosum(int[] arr, int n, int d) {
        Arrays.sort(arr);
        int sum = 0;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            sum = arr[left] + arr[right];
            if (sum == d) {
                return true;
            } else if (sum > d) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}
