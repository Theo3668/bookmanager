package cs.capstone.bookmanager.rest;

import cs.capstone.bookmanager.entity.Student;
import cs.capstone.bookmanager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRestController {

    private StudentService studentService;

    @Autowired
    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

    // expose "/students" and return list of students
    @GetMapping("/students")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    // add mapping for GET /students/{studentNumber}

    @GetMapping("/students/{studentNumber}")
    public Student getStudent(@PathVariable int studentNumber) {

        Student theStudent = studentService.findById(studentNumber);

        if (theStudent == null) {
            throw new RuntimeException("Student number not found - " + studentNumber);
        }

        return theStudent;
    }

    // add mapping for POST /students - add new student

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student theStudent) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        theStudent.setStudentNumber(0);

        studentService.save(theStudent);

        return theStudent;
    }

    // add mapping for PUT /students - update existing student

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student theStudent) {

        studentService.save(theStudent);

        return theStudent;
    }

    // add mapping for DELETE /students/{studentNumber} - delete student

    @DeleteMapping("/students/{studentNumber}")
    public String deleteStudent(@PathVariable int studentNumber) {

        Student tempStudent = studentService.findById(studentNumber);

        // throw exception if null

        if (tempStudent == null) {
            throw new RuntimeException("student number not found - " + studentNumber);
        }

        studentService.deleteById(studentNumber);

        return "Deleted student number - " + studentNumber;
    }
}
