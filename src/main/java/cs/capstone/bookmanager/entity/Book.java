package cs.capstone.bookmanager.entity;

import javax.persistence.*;

@Entity
@Table(name = "Book")
public class Book {

    //define fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int bookId;

    @Column(name = "student_number")
    private int currentHolder;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "title")
    private String title;

    @Column(name = "category")
    private String category;

    //define constructors

    public Book() {
    }

    public Book(int currentHolder, String isbn, String title, String category) {
        this.currentHolder = currentHolder;
        this.isbn = isbn;
        this.title = title;
        this.category = category;
    }
    //define getters and setters

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getCurrentHolder() {
        return currentHolder;
    }

    public void setCurrentHolder(int currentHolder) {
        this.currentHolder = currentHolder;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    //define tostring


    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", currentHolder=" + currentHolder +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
