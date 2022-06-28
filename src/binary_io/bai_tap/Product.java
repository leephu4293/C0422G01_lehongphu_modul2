package binary_io.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product implements Serializable {

    private int code;
    private String name;
    private String brand;
    private double price;
    private String moreinfo;

    public Product() {
    }

    public Product(int code, String name, String brand, double price, String moreinfo) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.moreinfo = moreinfo;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // ??? Moreinfo -5k
    public String getMoreinfo() {
        return moreinfo;
    }

    // ??? Moreinfo -5k
    public void setMoreinfo(String moreinfo) {
        this.moreinfo = moreinfo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", moreinfo='" + moreinfo + '\'' +
                '}';
    }
}