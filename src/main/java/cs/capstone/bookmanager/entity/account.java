package cs.capstone.bookmanager.entity;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class account {

    //define fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_number")
    private int id;

    @Column(name = "student_number")
    private int studentNumber;

    @Column(name = "password")
    private String password;

    //define constructors

    public account(){}

    public account(int studentNumber, String password) {
        this.studentNumber = studentNumber;
        this.password = password;
    }

    //define getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    //define tostring


    @Override
    public String toString() {
        return "account{" +
                "id=" + id +
                ", studentNumber=" + studentNumber +
                ", password='" + password + '\'' +
                '}';
    }
}