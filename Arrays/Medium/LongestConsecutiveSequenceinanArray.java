package Arrays.Medium;

import java.util.HashSet;
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
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int el : set) {
            if (!set.contains(el - 1)) {
                count = 1;
                int x = el;
                while (set.contains(el + 1)) {
                    count++;
                    el++;
                }
                if (maxcount < count) {
                    maxcount = count;
                }
            }
        }
        return maxcount;
    }
}
