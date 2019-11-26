package pl.coderslab.pattern;

public class TwitterObserver implements Observer {
    @Override
    public void update(String title) {
        System.out.println("JESTEM TWITTER OBSERVER update: " + title);
    }
}
