package Arrayss3.Array;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai mang ");
        int lengthA = sc.nextInt();
        float[] arr = new float[lengthA];
        System.out.println("nhap phan tu mang ");
        for (int i = 0; i < lengthA; i++) {
            arr[i] = sc.nextFloat();
        }
        float min = arr[0];
        for (int i = 0; i < lengthA; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("nho nhat la" + min);
    }
}
