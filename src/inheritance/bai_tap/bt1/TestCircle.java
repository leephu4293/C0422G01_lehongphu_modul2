package inheritance.bai_tap.bt1;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap radius");
        double radius = Double.parseDouble(sc.nextLine());
        System.out.println("nhap color");
        String color = sc.nextLine();
        System.out.println("nhap chieu cao ");
        double high = sc.nextDouble();
        Cylinder cylinder= new Cylinder(radius,color,high);
        System.out.println("the tich la " + cylinder.volume());
        System.out.println(cylinder.toString());
    }
}
