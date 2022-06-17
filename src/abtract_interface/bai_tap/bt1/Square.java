package abtract_interface.bai_tap.bt1;


public class Square extends Shape implements Resizeable {
    private double size;
    public Square() {

    }
    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                '}';
    }

    @Override
    public void resizeable(double percent) {
        size+= size * percent/100;
    }
}
