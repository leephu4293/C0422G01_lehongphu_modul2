package java_intro.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai mang ");
        int index = Integer.parseInt(sc.nextLine());
        float[] arr = new float[index];
        System.out.println("nhap pah ntu mang ");
        for (int i = 0; i < index; i++) {
            arr[i] = Float.parseFloat(sc.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("nhap pahn tu muon xoa ");
        float del = Float.parseFloat(sc.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (del == arr[i]) {
                for (int j = i; j < arr.length-1 ; j++) {
                    arr[j]=arr[j+1];
                    arr[j+1]=0;
                }
              i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
