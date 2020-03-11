package encapsulation;
public class Book {
    // fields (instance variables)
    private String title;
    private String author;
    private boolean borrowed;
    // constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }
    // methods (behaviors)
    // GETTERS
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isBorrowed() {
        return borrowed;
    }
    // SETTERS
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}