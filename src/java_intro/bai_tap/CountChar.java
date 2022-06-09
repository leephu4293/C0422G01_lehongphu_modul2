package java_intro.bai_tap;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi ");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("nhap ky tu muon dem ");
        int count = 0 ;
        char sym = sc.nextLine().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (sym == str.charAt(i)){
                count ++;
            }
        }
        if (count==0){
            System.out.println("khong xuat hien ");
        }else {
        System.out.println("so lan xuat hien " + count);
    }
    }
}
