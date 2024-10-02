package Arrays.Hard;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int res = Ncr(n-1, r-1);

        System.out.println(res);

    }
    public static int Ncr(int n,int r){
        int res =1;
        for(int i=1;i<r;i++){
            res= res*(n-i);
            res=res*(i+1);
        }
        return res;
    }
}
