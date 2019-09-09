package cs.capstone.bookmanager.service;

import java.util.List;


import cs.capstone.bookmanager.entity.Student;

public interface StudentService {

	public List<Student> findAll();
	
	public Student findById(int theId);
	
	public void save(Student theStudent);
	
	public void deleteById(int theId);
	
}
