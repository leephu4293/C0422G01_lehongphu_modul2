package thuat_toan;

import java.util.Arrays;

public class insert {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,8,9,-1,-5};
        sort (arr);
    }
    public static void sort (int [] arr ){
        int x ;
        int pos;
        for (int i  = 1; i < arr.length;  i++) {
            x= arr[i];
            pos = i;
            System.out.println(" lay ra phan tu thu " + pos + " gia  tri la " + x );
            while (pos > 0 && x < arr[pos -1 ]){
                arr[pos] = arr[pos-1];
                System.out.println(" di chuyen phan tu " + (pos-1)+ " sang " + pos );
                System.out.println(Arrays.toString(arr));
                pos -- ;
            }
            arr[pos] = x;
            System.out.println("gan gia tri" + x + " vao vi tri " +pos  );
            System.out.println(Arrays.toString(arr));
            }
        }
    }

