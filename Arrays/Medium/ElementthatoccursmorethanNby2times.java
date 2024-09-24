package Arrays.Medium;

import java.util.Scanner;

public class ElementthatoccursmorethanNby2times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = repeat(arr, n);

        System.out.println(res);

    }

    public static int repeat(int[] arr, int n) {
        int el = arr[0];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                el = arr[i];
                count = 1;
            } else if (arr[i] == el) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el) {
                count1++;
            }
        }
        if (count1 >= n / 2)
            return el;
        else return -1;
    }
}
