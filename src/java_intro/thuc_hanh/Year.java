package java_intro.thuc_hanh;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap nam ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "  la nam nhuan ");
        } if (year % 100==0  && year % 400 != 0  ){
            System.out.println(year + "khong la nam nhuan ");
        } if (year % 100 ==0 && year % 400 == 0){
            System.out.println(year + " la nam nhuan ");
        }
    }
}
