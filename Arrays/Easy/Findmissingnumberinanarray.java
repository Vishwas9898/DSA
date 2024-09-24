package Arrays.Easy;

import java.util.Scanner;

public class Findmissingnumberinanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = MissingNumber(arr, n);

        System.out.println(res);

    }

    public static int MissingNumber(int[] arr, int n) {
        int sum = ((n + 1) * (n + 1 + 1)) / 2;
        int defsum = 0;
        for (int i = 0; i < n; i++) {
            defsum += arr[i];
        }
        return sum - defsum;
    }
}
