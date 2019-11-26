package pl.coderslab;

import java.util.List;

public interface Dao<T> {

    void delete(int id);

    public T getObject(int id);

    List<String> getNames();
}
