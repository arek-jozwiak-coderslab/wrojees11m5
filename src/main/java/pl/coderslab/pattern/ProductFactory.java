package pl.coderslab.pattern;

public class ProductFactory {


    public Product createProduct(String type) {
        Product product = null;
        if (type.equals("simple")) {
            product = new SimpleProduct();
        }
        if (type.equals("advanced")) {
            product = new AdvancedProduct();
        }
        if (type.equals("virtual")) {
            product = new VirtualProduct();
        }

        return product;
    }
}
