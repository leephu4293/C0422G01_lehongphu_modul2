package java_intro.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai mang 1 ");
        int length1 = Integer.parseInt(sc.nextLine());
        System.out.println("nhap chieu dai mang 2 ");
        int length2 = Integer.parseInt(sc.nextLine());
        float [] arr1 = new float[length1];
        float [] arr2 = new float[length2];
        float [] arr3 = new float[length1 + length2];
        System.out.println("nhap pahn tu mang 1 ");
        for (int i = 0; i < length1; i++) {
            arr1[i]= Float.parseFloat(sc.nextLine());
        }
        System.out.println("nhap pahn tu mang 2 ");
        for (int i = 0; i < length2; i++) {
            arr2[i]= Float.parseFloat(sc.nextLine());
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.arraycopy(arr1,0,arr3,0,length1);
        System.arraycopy(arr2,0,arr3,arr3.length -length1,length2);
        System.out.println(Arrays.toString(arr3));
    }
}
