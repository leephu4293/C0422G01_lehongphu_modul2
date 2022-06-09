package java_intro.thuc_hanh;

import java.util.Scanner;

public class LaiSuat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien gui ");
        double money = sc.nextDouble();
        System.out.println("nhap so thang gui ");
        int month = sc.nextInt();
        System.out.println("nhap lai suat theo thang:");
        double rate = sc.nextDouble();
        double moneyRate = 0;
        for (int i = 0; i < month; i++) {
            moneyRate += money * (rate / 100) / 12 * month;
        }
        System.out.println("tien lai la:" + moneyRate);
    }
}
