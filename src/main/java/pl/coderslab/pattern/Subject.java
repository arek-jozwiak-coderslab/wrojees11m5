package pl.coderslab.pattern;

public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();

}