package Arrays.Easy;

import java.util.Scanner;

public class MoveZerostoend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Zerostoend(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void Zerostoend(int[] arr, int n) {
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                x = i;
                break;
            }
        }
        for (int i = x + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[x];
                arr[x] = temp;
                x++;
            }
        }
    }
}
