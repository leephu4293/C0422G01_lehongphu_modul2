package inheritance.bai_tap.bt1;

public class Cylinder extends Circle_Cylinder {
    private  double high;

    public Cylinder(double radius, String color, double high) {
        super(radius, color);
        this.high = high;
    }

    public Cylinder() {
    }

    public double getHigh() {
        return high;
    }
    public void setHigh(double high) {
        this.high = high;
    }
    public double volume(){
       return  super.getArea()*high;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "high=" + high  +","+ super.toString()+
                '}';
    }
}



