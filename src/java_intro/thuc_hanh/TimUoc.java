package java_intro.thuc_hanh;

import java.util.Scanner;

public class TimUoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = sc.nextInt();
        System.out.println("nhap so b");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 && b==0 ){
            System.out.println("khong co UCLN");
        }
        if (a==0 || b==0){
            System.out.println("UCLN la: " + Math.max(a,b));
        }
        while (a!=b){
            if (a>b ){
                a= a-b;
            }else {
                b=b-a;
            }
        }
        System.out.println("UCLN cua a va b:" + a);
    }
}
