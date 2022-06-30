package regex_string.bai_tap;

import java.util.Scanner;

public class PhoneNum {
    public static boolean checkPhone(String str){
        final String REGEX = "^\\([0-9]{2}\\)-\\(0\\d{9}\\)$";
        boolean check = str.matches(REGEX);
        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap sdt ");
        String phoneNumber;
        do {
            phoneNumber= sc.nextLine();
            if (checkPhone(phoneNumber)){
                System.out.println("ok");
                break;
            }else {
                System.out.println("nhap lai ");
            }
        }while (true);
    }
}
