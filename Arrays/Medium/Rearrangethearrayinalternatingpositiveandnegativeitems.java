package Arrays.Medium;

import java.util.ArrayList;
import java.util.Scanner;

public class Rearrangethearrayinalternatingpositiveandnegativeitems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Rearrange(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }


    }

    public static void Rearrange(int[] arr, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                neg.add(arr[i]);
            } else {
                pos.add(arr[i]);
            }
        }
        if (pos.size() >= neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                arr[i * 2] = pos.get(i);
                arr[(i * 2) + 1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                arr[index] = pos.get(i);
                index++;
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                arr[i * 2] = pos.get(i);
                arr[(i * 2) + 1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr[index] = pos.get(i);
                index++;
            }
        }

    }
}
