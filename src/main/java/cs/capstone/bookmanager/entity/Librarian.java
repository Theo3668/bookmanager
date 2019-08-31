package cs.capstone.bookmanager.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Librarian {

    //define fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "librarian_id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    //define constructors

    public Librarian(){}

    public Librarian(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //define getters and setters


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //define tostring


    @Override
    public String toString() {
        return "Librarian{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
