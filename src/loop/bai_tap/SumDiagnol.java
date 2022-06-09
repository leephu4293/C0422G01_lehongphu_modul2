package loop.bai_tap;

import java.util.Scanner;

public class SumDiagnol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai mang  ");
        int length1 = sc.nextInt();
        System.out.println("nhap chieu dai mang con ");
        int length2= sc.nextInt();
        float [][] arr = new float[length1][length2];
        System.out.println("nhap pahn tu mang ");
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                arr[i][j]= sc.nextFloat();
            }
        }
        float sum = 0 ;
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < length2; j++) {
                if (j==i){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("tong duong cheo " + sum );
    }
}
