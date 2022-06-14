package inheritance.bai_tap.bt1;

import java.util.Scanner;

public class Circle_Cylinder {
    private double radius;
    private String color;
    private double area;

    public Circle_Cylinder() {
    }

    public Circle_Cylinder(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return (radius*radius)*Math.PI;
    }

    public void setArea(double area) {
        this.area = area;
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

    @Override
    public String toString() {
        return "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area;
    }
}
