package Arrayss3.Array;

import java.util.Arrays;
import java.util.Scanner;

public class PushArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai mang ");
        int index = Integer.parseInt(sc.nextLine());
        float[] arr = new float[index];
        System.out.println("nhap phan tu mang ");
        for (int i = 0; i < index; i++) {
            arr[i] = sc.nextFloat();
        }
        System.out.println(Arrays.toString(arr));
        float [] arr1 = new float[index+1];
        System.arraycopy(arr,0,arr1,0,index);
        System.out.println("nhap gia tri muon chen ");
        float add = sc.nextFloat();
        System.out.println("nhap vi tri muon chen ");
        int addIndex = sc.nextInt();
        if (addIndex < 0 || addIndex > arr1.length-1) {
            System.out.println("khong chen dc;");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (addIndex == i ){
                    for (int j =arr1.length-1; j>i ; j--) {
                            arr1[j]=arr1[j-1];
                    }
                    arr1[i]= add;
                    }
                }
            System.out.println(Arrays.toString(arr1));

            }
        }
    }
