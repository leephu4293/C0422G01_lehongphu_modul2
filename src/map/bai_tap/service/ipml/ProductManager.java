package map.bai_tap.controller;

import map.bai_tap.model.Product;
import map.bai_tap.service.Ifuncition;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ProductManager implements Ifuncition {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Product> newproduct = new ArrayList();

    static {
        newproduct.add(new Product(1, "iphone", 2000));
    }

    @Override
    public void add() {
        System.out.println("nhap id ");
        int idAdd;
        boolean flag;
        do {
            flag = false;
            idAdd = Integer.parseInt(sc.nextLine());
            for (Product x : newproduct) {
                if (x == null) {
                    break;
                } else if (idAdd == x.getId()) {
                    flag = true;
                    System.out.println("nhap lai id da ton tai ");
                }
            }
        } while (flag);
        System.out.println("nhap ten san pham ");
        String nameAdd = sc.nextLine().toLowerCase();
        System.out.println("nhap gia san pham ");
        double priceAdd = Double.parseDouble(sc.nextLine());
        newproduct.add(new Product(idAdd, nameAdd, priceAdd));
    }

    @Override
    public void Display() {
        for (Product product : newproduct) {
            if (product == null) {
                break;
            } else {
                System.out.println(product);
            }
        }
    }


    @Override
    public void edit() {
        System.out.println("nhap id san pham muon sua ");
        int idEdit = Integer.parseInt(sc.nextLine());
        if (idEdit > 0) {
            for (Product product : newproduct) {
                if (product == null) {
                    break;
                } else if (product.getId() == idEdit) {
                    System.out.println("nhap id");
                    product.setId(Integer.parseInt(sc.nextLine()));
                    System.out.println("nhap lai name ");
                    product.setName(sc.nextLine().toLowerCase());
                    System.out.println("nhap lai gia");
                    product.setPrice(Double.parseDouble(sc.nextLine()));
                    break;
                }
            }
        }

    }

    @Override
    public void delete() {
        System.out.println("nhap id muon xoa ");
        int iddelete = Integer.parseInt(sc.nextLine());
        if (iddelete > 0) {
            for (Product x : newproduct) {
                if (x.getId() == iddelete) {
                    newproduct.remove(x);
                }
            }
        }
    }

    @Override
    public void seach() {
        System.out.println("nhap ten san pham muon tim ");
        String name = sc.nextLine().trim().toLowerCase();
        for (Product x : newproduct) {
            if (name.equals(x.getName())) {
                System.out.println(x);
            }
        }
    }

    @Override
    public void sort() {
    }
}