package cs.capstone.bookmanager.entity;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    //define fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int accountNumber;

    @Column(name = "password")
    private String password;

//    @OneToOne(mappedBy="account", cascade=CascadeType.ALL)
//    private Student student;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="book_id")
    private Book book;

    //define constructors

    public Account(){}

    public Account(String password) {
        this.password = password;
//        this.student = student;
    }

    //define getters and setters

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }


    //define tostring


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", password='" + password + '\'' +
//                ", student=" + student +
                '}';
    }
}
