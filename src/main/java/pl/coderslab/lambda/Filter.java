package pl.coderslab.lambda;

@FunctionalInterface
public interface Filter<V> {
    boolean check(V v);
}
