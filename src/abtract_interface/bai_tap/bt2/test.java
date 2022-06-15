package abtract_interface.bai_tap.bt2;

public class test {
    public static void main(String[] args) {
        Shape[] shapes= new Shape[3];
        shapes[0]= new Circle(2);
        shapes[1]= new Retange(2,3);
        shapes[2]= new Square();
        for (Shape shape:shapes) {
            if (shape instanceof Circle ){
                System.out.println(shape+ "dien tich = "+   ((Circle) shape).Area() );
            }if (shape instanceof Retange ) {
                if (shape instanceof Square) {
                    System.out.println("Square dien tich la " + ((Square) shape).Area());
                    System.out.println(((Square) shape).howToColor());
                } else {
                    System.out.println(shape + "dien tich = " + ((Retange) shape).Area());
                }
            }
        }
        }
    }
