public class Textbook {

    private String title;
    private String author;
    private String publisher;

    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String pub) {
        this.publisher = pub;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String auth) {
        this.author = auth;
    }
}