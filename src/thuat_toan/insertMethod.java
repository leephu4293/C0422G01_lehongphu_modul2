package thuat_toan;

import java.util.Arrays;
import java.util.Scanner;

public class insertMethod {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("nhap phan tu cua mang ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.println("nhap phan tu mang ");
        for (int i = 0; i < size; i++) {
            arr[i]= sc.nextInt();
        }
        sort (arr);
    }
    public static void sort (int [] arr ){
        int x ;
        int pos;
        for (int i  = 1; i < arr.length;  i++) {
            x= arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos -1 ]){
                arr[pos] = arr[pos-1];
                System.out.println(Arrays.toString(arr));
                pos -- ;
            }
            arr[pos] = x;
        }
        System.out.println(Arrays.toString(arr));
    }
}


