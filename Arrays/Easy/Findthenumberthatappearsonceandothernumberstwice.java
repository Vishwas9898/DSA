package Arrays.Easy;

import java.util.Scanner;

public class Findthenumberthatappearsonceandothernumberstwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = NumberAppearingOnce(arr, n);

        System.out.println(res);

    }

    public static int NumberAppearingOnce(int[] arr, int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
}
