package class_obj.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    private QuadraticEquation(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getdelta() {
        return (this.b * this.b) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return ((-this.b + Math.sqrt(this.getdelta())) / (2 * this.a));
    }

    public double getRoot2() {
        return ((-this.b - Math.sqrt(this.getdelta())) / (2 * this.a));
    }

    public double getDiscriminant() {
        return (-this.b / 2 * this.a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        float a = sc.nextFloat();
        System.out.println("nhap b ");
        float b = sc.nextFloat();
        System.out.println("nhap c ");
        float c = sc.nextFloat();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getdelta() < 0) {
            System.out.println("pt vo nghiem");
        } else if (quadraticEquation.getdelta() == 0) {
            System.out.println("pt co nghiem kep x= " + quadraticEquation.getDiscriminant());
        } else {
            System.out.println("pt co nghiem x1=" + quadraticEquation.getRoot1() + "\n" + "nghiem x2=" + quadraticEquation.getRoot2());
        }
    }
}

