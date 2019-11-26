package pl.coderslab.pattern;

public class SimpleSingleton {

    private static SimpleSingleton INSTANCE;

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        if (INSTANCE == null){
            System.out.println("TWORZE INSTANCJE");
            INSTANCE = new SimpleSingleton();
        }
        return INSTANCE;
    }

}
