package pl.coderslab.pattern;

public class SingletonMain {

    public static void main(String[] args) {

        SimpleSingleton instance = SimpleSingleton.getInstance();
        SimpleSingleton instance2 = SimpleSingleton.getInstance();

        System.out.println(instance);
        System.out.println(instance2);

    }
}
