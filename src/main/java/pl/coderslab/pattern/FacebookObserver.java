package pl.coderslab.pattern;

public class FacebookObserver implements Observer {
    @Override
    public void update(String title) {
        System.out.println("JESTEM FACEBOOK OBSERVER update: " + title);
    }
}
