package Arrays.Easy;

import java.util.Scanner;

public class LongestsubarraywithgivensumKpositives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = longest(arr, n, d);
        System.out.println(res);
    }

    public static int longest(int[] arr, int n, int d) {
        int right = 0;
        int left = 0;
        int sum = 0;
        int maxlen = 0;
        while (right < n) {
            while (left > 0 && sum > d) {
                sum -= arr[left];
                left++;
            }
            if (sum == d) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
            right++;
            if (right < n) sum += arr[right];
        }
        return maxlen;
    }
}
