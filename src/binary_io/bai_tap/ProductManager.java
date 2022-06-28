package binary_io.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static void  writePro(List<Product> products, String path){
        File file = new File(path);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static List<Product> readPro(String path){
        List<Product> products = new ArrayList<>();
        File file = new File(path);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return products;
    }
    public static void add () {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id san pham ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten  san pham ");
        String name = sc.nextLine();
        System.out.println("nhap thuong hieu san pham ");
        String brand = sc.nextLine();
        System.out.println("nhap gia san pham ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("nhap mo ta  san pham ");
        String moreinfo = sc.nextLine();
        List<Product> products = readPro("src/binary_io/bai_tap/product.dat");
        products.add(new Product(id,name,brand,price,moreinfo));
        writePro(products,"src/binary_io/bai_tap/product.dat");
    }
    public static void search (){
        List <Product> products =  readPro("src/binary_io/bai_tap/product.dat");
        System.out.println("nhap id muon tim ");
        Scanner sc = new Scanner(System.in);
        // idsearch ???
        int idsearch= sc.nextInt();
        for (Product x:products) {
            if (idsearch == x.getCode()){
                System.out.println(x);
            }
        }

    }
    public static void display(){
        List<Product> products = readPro("src/binary_io/bai_tap/product.dat");
        for (Product x: products) {
            System.out.println(x);
        }
    }
}
