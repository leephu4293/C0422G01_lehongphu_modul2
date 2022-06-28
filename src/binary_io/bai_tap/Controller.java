package binary_io.bai_tap;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap lua chon "+"\n"
                + "1.  Add "+ "\n"
                + "2. seach "+ "\n"
                + "3. dispaly"+"\n"
                +"0. Exit" );
        int num;
        do {
            num = sc.nextInt();
            switch (num){
                case 1 :
                    ProductManager.add();
                    System.out.println("nhap lai lua chon ");
                    break;
                case 2 :
                    ProductManager.search();
                    System.out.println("nhap lai lua chon ");
                    break;
                case 3 :
                    ProductManager.display();
                    System.out.println("nhap lai lua chon ");
                    break;
                case 0:
                    System.out.println("Exit");
            }
        }while (num != 0 );
    }
}

