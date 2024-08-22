package ComPadrao;

import java.util.ArrayList;
public class ProductIterator implements Iterator {
    private ArrayList<Product> products;
    private int position;

    public ProductIterator(ArrayList<Product> products) {
        this.products = products;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < products.size();
    }

    public Product next() {
        return products.get(position++);
    }
}