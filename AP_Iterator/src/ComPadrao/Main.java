package ComPadrao;

// Classe ComPadrao.Main (Com ComPadrao.Iterator)
public class Main {
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        productList.addProduct(new Product("Notebook"));
        productList.addProduct(new Product("Celular"));
        productList.addProduct(new Product("Tablet"));
        productList.addProduct(new Product("Pc"));

        displayProductNames(productList.createIterator());
    }

    public static void displayProductNames(Iterator iterator) {
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            System.out.println(product.getName());
        }
    }
}