package Arrays.Easy;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = LinearSearch(arr, n, d);
        System.out.println(res);
    }

    public static int LinearSearch(int[] arr, int n, int d) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == d) {
                return i;
            }
        }
        return -1;

    }
}
