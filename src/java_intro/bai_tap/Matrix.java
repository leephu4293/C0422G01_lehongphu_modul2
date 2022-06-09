package java_intro.bai_tap;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai mang cha ");
        int lengthMatrix = sc.nextInt();
        System.out.println("nhap chieu dai mang nho");
        int lengthMatrix1 = sc.nextInt();
        float [][] arr = new float[lengthMatrix][lengthMatrix1];
        System.out.println("nhap phan tu mang ");
        for (int i = 0; i < lengthMatrix ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= sc.nextFloat();
            }
        }
        float max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            System.out.println("max la  " + max);
        }

        }
    }

