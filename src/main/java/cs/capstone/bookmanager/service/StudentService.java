package cs.capstone.bookmanager.service;

import cs.capstone.bookmanager.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> findAll();

    public Student findById(int theId);

    public void save(Student theEmployee);

    public void deleteById(int theId);
}
