package cs.capstone.bookmanager.controller;


import java.util.List;

import cs.capstone.bookmanager.entity.Account;
import cs.capstone.bookmanager.entity.Student;
import cs.capstone.bookmanager.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	// add mapping for "/list"
	@GetMapping("/list")
	public String listStudents(Model model) {

		List <Student> students = studentService.findAll();
		
		// add to the spring model
		model.addAttribute("students", students);
		
		return "students/list-students";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model){
		Student student = new Student();
		model.addAttribute("student",student);

		return "students/student-form";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentId")int studentNumber, Model model){

//		get the student from the service/db
		Student student = studentService.findById(studentNumber);

//		set student as a model attribute to pre-populate the form
		model.addAttribute("student",student);


		model.addAttribute("student",student);
//		send over to our form
		return "students/student-form";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("studentId")int studentNumber, Model model){
//		delete the student
		studentService.deleteById(studentNumber);

//		redirect to students/list
		return "redirect:/students/list";
	}
	@PostMapping("/save")
	public String saveStudent(@ModelAttribute("student") Student student){
		Account account = new Account("password");
		student.setAccount(account);
//		save the student
		studentService.save(student);

//		use a redirect to prevent duplicate submissions
		return "redirect:/students/list";
	}
}









