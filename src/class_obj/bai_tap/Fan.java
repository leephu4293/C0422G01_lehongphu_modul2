package class_obj.bai_tap;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius;
    private String color="blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }
    public String toString(){
        if (this.isOn()){
            return "toc do quat la:" + this.getSpeed()+"\n"+"mau sac la "+ this.getColor()+"\n"+ "ban kinh la " + this.getRadius()+ "\n"+"Fan is on ";
        } else {
            return  "color la " + this.getColor() +"\n"+ "ban kinh la " + this.getRadius()+"\n"+ "fan is off ";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setSpeed(3);
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.getColor();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println( " quat 1 " +"\n" + fan1.toString());
        System.out.println( " quat 2 " +"\n"+ fan2.toString());
    }
}
