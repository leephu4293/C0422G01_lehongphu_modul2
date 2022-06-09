package java_intro.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class DaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai mang ");
        int index = Integer.parseInt(sc.nextLine());
        float [] arr = new float[index];
        System.out.println("nhap phan tu mang ");
        for (int i = 0; i < index; i++) {
            arr[i]= Float.parseFloat(sc.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length/2; i++) {
            float tmp = arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i]= tmp;
            }
        System.out.println(Arrays.toString(arr));
        }
        }


