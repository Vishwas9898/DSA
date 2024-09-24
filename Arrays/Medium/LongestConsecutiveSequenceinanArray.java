package Arrays.Medium;

import java.util.Scanner;

public class LongestConsecutiveSequenceinanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = Longest(arr, n);

        System.out.println(res);

    }

    public static int Longest(int[] arr, int n) {
        int count = 0;
        int maxcount = 0;
        int left = 0;
        int right = 1;
        while (right < n) {
            if (arr[left] == 1 + arr[right]) {
                count++;
                maxcount = Math.max(maxcount, count);
            } else {
                count = 0;
            }
            right++;
            left++;
        }
        return maxcount;
    }
}
