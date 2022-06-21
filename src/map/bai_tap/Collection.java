package map.bai_tap.thuc_hanh;

import java.util.Scanner;

public class Collection {
    public static void main(String[] args) {
            System.out.println("Chọn lựa " +
                    "\n" + "1.Display " +
                    "\n" + "2.add Product" +
                    "\n" + "3.Edit Product" +
                    "\n" + "4.Delete Product" +
                    "\n" + "5.Seach Product" +
                    "\n" + "6.Sort Product" +
                    "\n" + "0.Exit");
            Scanner sc = new Scanner(System.in);
            int num;
            do {
                num = sc.nextInt();
                switch (num) {
                    case 1:
                        CollectionManager.Display();
                        System.out.println("nhap tiep lua chon");
                        break;
                    case 2:
                        CollectionManager.add();
                        System.out.println("nhap tiep lua chon");
                        break;
                    case 3:
                        CollectionManager.edit();
                        System.out.println("nhap tiep lua chon");
                        break;
                    case 4:
                        CollectionManager.delete();
                        System.out.println("nhap tiep lua chon");
                        break;
                    case 5:
                        CollectionManager.seach();
                        System.out.println("nhap tiep lua chon");
                        break;
                    case 6:
                       CollectionManager.sort();
                        System.out.println("nhap tiep lua chon");
                    case 7:
                        System.out.println("Exit");
                        break;
                }
            } while (num != 0);

        }

    }

