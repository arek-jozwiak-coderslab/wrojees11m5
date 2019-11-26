package pl.coderslab.pattern;

public class ObserverMain {

    public static void main(String[] args) {
        FacebookObserver facebookObserver = new FacebookObserver();
        TwitterObserver twitterObserver = new TwitterObserver();
        Post post = new Post();
        post.setTitle("Thinking in java");
        post.attach(facebookObserver);
        post.attach(twitterObserver);
        post.share();

        System.out.println("--------------------");
        post.detach(facebookObserver);
        post.share();

    }
}
