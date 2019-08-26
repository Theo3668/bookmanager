package cs.capstone.bookmanager.dao;

import cs.capstone.bookmanager.entity.Student;

import java.util.List;

public interface StudentDAO {

    public List<Student> findAll();

    public Student findById(int studentNumber);

    public void save(Student theStudent);

    public void deleteById(int studentNumber);
}
