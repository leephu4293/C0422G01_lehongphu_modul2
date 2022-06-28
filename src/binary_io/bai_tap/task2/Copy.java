package binary_io.bai_tap.task2;

import binary_io.bai_tap.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Copy {
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
            for (Product x:products) {
                System.out.println(x);
            }
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

    public static void main(String[] args) {
        readPro("src/binary_io/bai_tap/product.dat");
        writePro( readPro("src/binary_io/bai_tap/product.dat"),"src/binary_io/bai_tap/task2/target.dat");
    }
}
