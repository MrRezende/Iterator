package SemPadrao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        productList.addProduct(new Product("Notebook"));
        productList.addProduct(new Product("Celular"));
        productList.addProduct(new Product("Tablet"));
        productList.addProduct(new Product("Pc"));

        displayProductNames(productList);
    }

    public static void displayProductNames(ProductList productList) {
        ArrayList<Product> products = productList.getProducts();
        for (Product product : products) {
            System.out.println(product.getName());
        }
    }
}

