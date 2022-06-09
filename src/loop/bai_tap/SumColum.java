package loop.bai_tap;

import java.util.Scanner;

public class SumColum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai mang cha ");
        int length1 = sc.nextInt();
        System.out.println("nhap chieu dai mang con ");
        int length2= sc.nextInt();
        float [][] arr = new float[length1][length2];
        System.out.println("nhap phan tu mang");
        for (int i = 0; i < length1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= sc.nextFloat();
            }
        }
        System.out.println("nhap cot muon tinh tong");
        int colum = sc.nextInt();
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (colum== j ){
                    sum+= arr[i][j];
                }
            }
        }
        System.out.println("sum la " + sum);
    }
}
