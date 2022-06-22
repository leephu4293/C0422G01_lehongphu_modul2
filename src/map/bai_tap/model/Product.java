package map.bai_tap.thuc_hanh;

import java.util.*;

public class Product implements Comparator<Product>{
    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int product) {
        this.id = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compare(Product o1, Product o2) {
        if (o2.getPrice() - o1.getPrice() > 0) {
            return 1;
        } else if (o2.getPrice() - o1.getPrice() < 0) {
            return -1;
        } else return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return id == product1.id && Double.compare(product1.price, price) == 0 && name.equals(product1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }
}


