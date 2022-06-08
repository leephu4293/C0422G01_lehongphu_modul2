package java_intro.bai_tap;

import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        Dispaly();
    }
        public static void Dispaly () {
            boolean flag = true;
            System.out.println("MENU" +
                    "\n" + "1. Print the rectangle" +
                    "\n" + "2. Print the square triangle" +
                    "\n" + "3. Print isosceles triangle" +
                    "\n" + "4. Exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap chon lua ");
            do {
                int choose = Integer.parseInt(sc.nextLine());
                switch (choose) {
                    case 1:
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 7; j++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }
                        break;
                    case 2:
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.print("\n");
                        }
                        System.out.println("-----------------");
                        for (int i = 5; i > 0; i--) {
                            for (int j = i; j > 0; j--) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        System.out.println("-----------------");
                        for (int i = 5; i >= 1; i--) {
                            for (int j = 0; j <= 5 - i; j++) {
                                System.out.print(" ");
                            }
                            for (int a = 1; a <= i; a++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        System.out.println("-- Print botton-right -- ");
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= 5; j++) {
                                if (j > 5 - i) {
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= 9; j++) {
                                if (5 - i < j && j < 5 + i) {
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println(" ");
                        }
                        break;
                    case 4:
                          flag = false;
                        break;
                }
            }while (flag) ;
        }

    }