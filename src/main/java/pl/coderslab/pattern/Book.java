package pl.coderslab.pattern;

public class Book {

    private String title;
    private int countPages;

    Book(String title, int countPages) {
        this.title = title;
        this.countPages = countPages;
    }

    public static BookBuilder builder() {
        return new BookBuilder();
    }

    public static class BookBuilder {
        private String title;
        private int countPages;

        BookBuilder() {
        }

        public BookBuilder title(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder countPages(int countPages) {
            this.countPages = countPages;
            return this;
        }

        public Book build() {
            return new Book(title, countPages);
        }

        public String toString() {
            return "Book.BookBuilder(title=" + this.title + ", countPages=" + this.countPages + ")";
        }
    }
}
