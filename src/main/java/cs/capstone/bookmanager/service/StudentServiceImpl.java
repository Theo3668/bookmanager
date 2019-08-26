package cs.capstone.bookmanager.service;

import cs.capstone.bookmanager.dao.StudentDAO;
import cs.capstone.bookmanager.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentDAO studentDAO;

    @Autowired
    public StudentServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    @Transactional
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    @Transactional
    public Student findById(int studentNumber) {
        return studentDAO.findById(studentNumber);
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        studentDAO.save(theStudent);

    }

    @Override
    @Transactional
    public void deleteById(int studentNumber) {
        studentDAO.deleteById(studentNumber);

    }
}
