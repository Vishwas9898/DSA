package Arrays.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class LongestsubarraywithsumKPositivesNegatives {
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
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefix_sum = 0;
        int max_len = 0;
        for (int i = 0; i < n; i++) {
            prefix_sum += arr[i];
            if (prefix_sum == d) {
                max_len = Math.max(max_len, i + 1);
            }

            if (map.containsKey(prefix_sum - d)) {
                max_len = Math.max(max_len, i - map.get(prefix_sum - d));
            }
            if (!map.containsKey(prefix_sum)) {
                map.put(prefix_sum, i);
            }
        }
        return max_len;
    }
}
