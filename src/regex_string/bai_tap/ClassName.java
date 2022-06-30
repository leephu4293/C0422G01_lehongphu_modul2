package regex_string.bai_tap;

import java.util.Scanner;

public class ClassName {

    public static boolean check(String str) {
        final String REGEX = "^[APC]\\d{4}[GHIKLM]$";
        boolean check = str.matches(REGEX);
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten lop ");
        String str;
        do {
             str = sc.nextLine();
            if (check(str)){
                System.out.println("ok");
                break;
            } else {
                System.out.println("nhap lai sai roi ");
            }
        } while (true);
    }
}