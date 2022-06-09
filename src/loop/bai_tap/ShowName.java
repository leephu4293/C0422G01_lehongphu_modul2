package loop.bai_tap;

import java.util.Scanner;

public class ShowName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong so nguyen to muon xem:");
        int  num = sc.nextInt();
        int check = 0;
        int primeNum = 2;
        int count = 0;
        while (count < num){
            for (int i=2; i < primeNum; i++){
                if (primeNum % i ==0  ){
                    check ++;
                    break;
                }
            }
            if (check == 0){
                System.out.println(primeNum);
                count ++;
            }
            primeNum++;
            check=0;

        }
    }
}
