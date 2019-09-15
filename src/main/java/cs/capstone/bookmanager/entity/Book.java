package cs.capstone.bookmanager.entity;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    //define fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int bookId;

    @Column(name = "img")
    private String image;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @ManyToOne
    private Account account;

    //define constructors

    public Book() {
    }

    public Book(String image, String isbn, String title, String author) {
        this.image = image;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    //define getters and setters

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    //define tostring


    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", image=" + image +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
//                ", account=" + account +
                '}';
    }
}
