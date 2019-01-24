package pl.coderslab;

public class Book {

    int id;
    String title;
    String author;
    String isbn;

    public Book(int id,String title, String author,String isbn)
    {
        this.id=id;
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public Book(String title, String author,String isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
