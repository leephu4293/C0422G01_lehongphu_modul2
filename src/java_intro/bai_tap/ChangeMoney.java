package java_intro.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap USD muon doi :");
        float money= sc.nextFloat();
        float change = money * 23000;
        System.out.println("theo ty gia 1 USD= 23000 VND;  "+ money +"USD = " + change + "VND");
    }
}
