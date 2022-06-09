package java_intro.thuc_hanh;

import java.util.Scanner;

public class UseMath {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai ");
        width = sc.nextFloat();
        System.out.println("nhap chieu cao ");
        height = sc.nextFloat();
        float s = width * height;
        System.out.println(s);
    }
}
