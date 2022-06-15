package abtract_interface.bai_tap.bt1;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0]= new Circle(3);
        shapes[1]= new Retange(2,3);
        shapes[2]= new Square(2);
        System.out.println(Arrays.toString(shapes));
        for (Shape shape: shapes){
            if (shape instanceof Circle){
                ((Circle) shape).resizeable(((Math.random()*100)));
                System.out.println(" hinh tron" +shape);
            }
            if (shape instanceof Retange) {
                if (shape instanceof Square) {
                    ((Square) shape).resizeable(((Math.random() * 100)));
                    System.out.println("hinh vuong " + shape);
                } else {
                    ((Retange) shape).resizeable(((Math.random() * 100)));
                    System.out.println("hinh chu nhat " + shape);
                }
            }
        }
    }
}
