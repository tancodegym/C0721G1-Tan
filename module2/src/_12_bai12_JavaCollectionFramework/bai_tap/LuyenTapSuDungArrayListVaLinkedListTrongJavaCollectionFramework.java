package _12_bai12_JavaCollectionFramework.bai_tap;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LuyenTapSuDungArrayListVaLinkedListTrongJavaCollectionFramework {

    static class RunMain {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.println("Menu");
                System.out.println("1. Add Product");
                System.out.println("2. Delete Product");
                System.out.println("3. Edit Product");
                System.out.println("4. Display Product list");
                System.out.println("5. Find Product by name");
                System.out.println("6. Sort Product by  price up");
//                System.out.println("7. Sort Product by  price down");
                System.out.println("0. Exit Menu");
                System.out.println("Enter your choice: ");
                int choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        ProductManager.addProduct();
                        break;
                    case 2:
                        ProductManager.deleteProduct();
                        break;
                    case 3:
                        ProductManager.editProduct();
                        break;
                    case 4:
                        ProductManager.displayProduct();
                        break;
                    case 5:
                        ProductManager.searchProduct();
                        break;
                    case 6:
                        ProductManager.sortProductByPriceUp();
                        break;
//                    case 7:
//                        ProductManager.sortProductByPriceDown();
//                        break;
                    default:
                        System.out.println("Please enter again !");
                        break;
                }
            }
        }


        static class Product implements Comparable<Product> {
            private int id;
            private int priceProduct;
            private String nameProduct;

            public Product() {
            }

            public Product(int id, int priceProduct, String nameProduct) {
                this.id = id;
                this.priceProduct = priceProduct;
                this.nameProduct = nameProduct;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getPriceProduct() {
                return this.priceProduct;
            }

            public void setPriceProduct(int priceProduct) {
                this.priceProduct = priceProduct;
            }

            public String getNameProduct() {
                return nameProduct;
            }

            public void setNameProduct(String nameProduct) {
                this.nameProduct = nameProduct;
            }

            public String productToString() {
                return "Id : " + getId() +
                        ", Name of product: " + getNameProduct() +
                        ", Price of product " + getPriceProduct();
            }

            @Override
            public int compareTo(Product product) {
                return this.getPriceProduct() - product.getPriceProduct();

            }
        }

        static class ProductManager {
            static ArrayList<Product> products = new ArrayList<>();
            static {
                products.add(new Product(1, 1000, "HonDa"));
                products.add(new Product(2, 2000, "Yamaha"));
                products.add(new Product(3, 5000, "Toyota"));
                products.add(new Product(4, 9000, "Suzuki"));
                products.add(new Product(5, 3000, "BMW"));
            }
            public static void addProduct() {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter id of product:");
                int idProduct = Integer.parseInt(input.nextLine());
                System.out.println("Enter price of product:");
                int priceProduct = Integer.parseInt(input.nextLine());
                System.out.println("Enter name of product:");
                String nameProduct = input.nextLine();
                products.add(new Product(idProduct, priceProduct, nameProduct));
                displayProduct();
            }

            public static void editProduct() {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter id of product:");
                int idProduct = Integer.parseInt(input.nextLine());
                System.out.println("Enter new price of product:");
                int priceProduct = Integer.parseInt(input.nextLine());
                System.out.println("Enter new name of product:");
                String nameProduct = input.nextLine();
                products.get(idProduct).setNameProduct(nameProduct);
                products.get(idProduct).setPriceProduct(priceProduct);
                displayProduct();
            }
            public static void deleteProduct() {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter id of product:");
                int idProduct = Integer.parseInt(input.nextLine());
                products.remove(idProduct);
                displayProduct();
            }
            public static void displayProduct() {
                IdProductCompartor idProductCompartor = new IdProductCompartor();
                Collections.sort(products,idProductCompartor);
                for (Product product : products) {
                    System.out.println(product.productToString());
                }
            }

            public static void searchProduct() {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter name of product ");
                String nameOfProduct = input.nextLine();
                int index = 0;
                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).getNameProduct() == nameOfProduct) {
                        index = i;
                    }
                }
                System.out.println("Product after search is: " + products.get(index).productToString());
            }
            public static void sortProductByPriceUp() {
                Collections.sort(products);
                System.out.println("Sort by prices up:");
                for (Product product : products) {
                    System.out.println(product.productToString());
                }
            }
//            public static void sortProductByPriceDown() {
//                PriceDownProductCompartor priceDownProductCompartor = new PriceDownProductCompartor();
//                Collections.sort(products,priceDownProductCompartor);
//                System.out.println("Sort by prices down:");
//                for (Product product : products) {
//                    System.out.println(product.productToString());
//                }
//            }
        }
    }
    public static class IdProductCompartor implements Comparator<RunMain.Product> {
        @Override
        public int compare(RunMain.Product o1, RunMain.Product o2) {
            if(o1.getId() > o2.getId()){
                return 1;
            }else if(o1.getId() == o2.getId()){
                return 0;
            }else{
                return -1;
            }
        }
    }}
