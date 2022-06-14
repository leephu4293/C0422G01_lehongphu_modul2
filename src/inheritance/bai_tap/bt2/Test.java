package inheritance.bai_tap.bt2;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap x");
        float x = sc.nextFloat();
        System.out.println("nhap y");
        float y = sc.nextFloat();
        System.out.println("nhap z ");
        float z = sc.nextFloat();
        Point3d point = new Point3d(x,y,z);
        System.out.println(point.toString());
        point.setXYZ(2,3,4);
        System.out.println(point.toString());
    }
}
