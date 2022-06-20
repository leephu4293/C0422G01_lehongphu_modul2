package queue_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ArrayReseverStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai mang  ");
        int lengtharr = Integer.parseInt(sc.nextLine());
        int [] arr = new int [lengtharr];
        System.out.println("nhap phan tu mang ");
        for (int i = 0; i < lengtharr; i++) {
            arr[i]= Integer.parseInt(sc.nextLine());
        }
        System.out.println( " mang ban dau" + Arrays.toString(arr));

        Stack <Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
      for (int i = 0; i < arr.length; i++) {
                arr[i]= stack.pop();
       }
        System.out.println( " mang dao " + Arrays.toString(arr));

        System.out.println("---------------------");
        System.out.println("nhap chuoi ");
        String str = sc.nextLine().trim();
        String[] arr1  = str.split(" ");
        Stack<String> stackStr = new Stack<>();
        for (int i = 0; i < arr1.length; i++) {
            stackStr.push(arr1[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= stackStr.pop();
        }
        for (String string: arr1) {
            System.out.print(string + " " );
        };
        }
    }

