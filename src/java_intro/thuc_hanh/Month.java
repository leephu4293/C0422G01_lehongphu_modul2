package java_intro.thuc_hanh;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap thang");
        byte a = sc.nextByte();
        switch (a){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println( "thagn" + a + " co 31 ngay ");
                break;
            case 2 :
                System.out.println("co the co 28 hoac 29 ");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang co 30 ngay ");
                break;
        }
    }
}
