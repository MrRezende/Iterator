package ComPadrao;

import java.util.ArrayList;

// Classe ComPadrao.ProductList (Com ComPadrao.Iterator)
public class ProductList implements Collection {
    private ArrayList<Product> products;

    public ProductList() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Iterator createIterator() {
        return new ProductIterator(products);
    }
}
