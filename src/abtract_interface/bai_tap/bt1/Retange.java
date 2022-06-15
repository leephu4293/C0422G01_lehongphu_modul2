package abtract_interface.bai_tap.bt1;

public class Retange extends Shape implements Resizeable{
    private double width = 1.0;
    private double length = 1.0;

    public Retange() {
    }

    public Retange(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Retange(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle width="
                + getWidth()
                + " and length="
                + getLength()
                + super.toString();
    }

    @Override
    public void resizeable(double percent) {
        width += width * percent / 100;
        length+= length+ percent/100;
    }
}
