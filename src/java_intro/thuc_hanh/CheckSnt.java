package java_intro.thuc_hanh;

import java.util.Scanner;

public class CheckSnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so can kiem tra ");
        int num = sc.nextInt();
        int uoc = 0;
        if (num > 1) {
            for (int i = 2 ;i < num; i++) {
                if (num % i == 0) {
                    uoc++;
                    break;
                }
            }
            if (uoc == 0) {
                System.out.println(num + " la so nguyen to ");
            } else {
                System.out.println(num + "khong la so nguyen to ");
            }
        }
    }
}
