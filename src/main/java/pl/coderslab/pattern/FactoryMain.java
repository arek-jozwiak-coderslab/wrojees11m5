package pl.coderslab.pattern;

public class FactoryMain {

    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        Product simple = productFactory.createProduct("simple");
        System.out.println(simple.getClass().getSimpleName());
    }
}
