package java_intro.thuc_hanh;

import java.util.Scanner;

public class PhuongTrinh {
    public static void main(String[] args) {
        System.out.println("giai pt ax + b = 0 ");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a ");
        double a = sc.nextDouble();
        System.out.println("nhap b ");
        double b = sc.nextDouble();
        if (a == 0 && b != 0) {
            System.out.println("pt vo nghiem ");
        }
        if (a != 0 && b == 0) {
            System.out.println("pt vo so nghiem");
        }
        if (a != 0) {
            double x = (-b) / a;
            System.out.println("pt co nghiem" + x);
        }
    }
}