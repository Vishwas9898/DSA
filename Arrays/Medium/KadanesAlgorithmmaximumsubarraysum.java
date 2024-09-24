package Arrays.Medium;

import java.util.Scanner;

public class KadanesAlgorithmmaximumsubarraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = maxsum(arr, n);

        System.out.println(res);

    }

    public static int maxsum(int[] arr, int n) {
        int sum = 0;
        int maxsum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (maxsum < sum) maxsum = sum;
            if (sum < 0) sum = 0;
        }
        return maxsum;
    }
}
