package pl.coderslab.pattern;

public class BookMain {

    public static void main(String[] args) {
        Book book =
                Book.builder()
                .title("Thinkink in Java")
                .countPages(1200)
                        .build();

    }
}
