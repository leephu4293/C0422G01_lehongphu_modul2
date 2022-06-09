package java_intro.thuc_hanh;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao can nang");
        float weight = sc.nextFloat();
        System.out.println("nhap chieu cao ");
        float height= sc.nextFloat();
        float Bmi = weight / (height * height);
        if (Bmi > 30.0){
            System.out.println("Obese");
        }else if (Bmi >= 25.0){
            System.out.println("Over weight");
        }else if (Bmi>= 18.5){
            System.out.println("nomal");
        }else {
            System.out.println("Underweight");
        }

    }
}
