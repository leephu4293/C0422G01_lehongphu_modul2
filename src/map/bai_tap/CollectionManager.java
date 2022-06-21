package map.bai_tap.thuc_hanh;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionManager {
        static Scanner sc = new Scanner(System.in);
        static ArrayList<Product>  newproduct = new ArrayList();

        static {
            newproduct.add(new Product(1,"iphone",2000));

        }
        public static void Display(){
            for (Product product:newproduct){
                if (product==null){
                    break;
                }else {
                    System.out.println(product);
                }
            }
        }
        public static void add (){
            System.out.println("nhap id ");
            int idAdd;
            boolean flag;
            do{
                flag = false;
                idAdd = Integer.parseInt(sc.nextLine());
                for (Product x:newproduct) {
                    if (x==null){
                        break;
                    }else if (idAdd==x.getId()){
                        flag= true;
                        System.out.println("nhap lai id da ton tai ");
                    }
                }
            }while (flag);
            System.out.println("nhap ten san pham ");
            String nameAdd = sc.nextLine().toLowerCase();
            System.out.println("nhap gia san pham ");
            double priceAdd = Double.parseDouble(sc.nextLine());
            newproduct.add(new Product(idAdd,nameAdd,priceAdd));
        }
        public  static void edit (){
            System.out.println("nhap id san pham muon sua ");
            int idEdit = Integer.parseInt(sc.nextLine());
            if (idEdit> 0 ){
                for (Product product :newproduct ) {
                    if (product == null){
                        break;
                    }else if (product.getId() == idEdit){
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
        public static void delete(){
            System.out.println("nhap id muon xoa ");
            int iddelete= Integer.parseInt(sc.nextLine());
            if (iddelete>0){
                for (Product x:newproduct){
                    if (x.getId()==iddelete){
                        newproduct.remove(x);
                    }
                }
            }
        }
        public static void seach(){
            System.out.println("nhap ten san pham muon tim ");
            String name = sc.nextLine().trim().toLowerCase();
            for (Product x:newproduct) {
                if (name.equals(x.getName())){
                    System.out.println(x);
                }

            }
        }
      public static void sort(){
            Collections.sort(newproduct, new Product());
      }
    }

