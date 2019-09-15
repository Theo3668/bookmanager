package cs.capstone.bookmanager.controller;

import cs.capstone.bookmanager.entity.Account;
import cs.capstone.bookmanager.entity.Book;
import cs.capstone.bookmanager.entity.Student;
import cs.capstone.bookmanager.service.BookService;
import cs.capstone.bookmanager.service.StudentService;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {

    private StudentService studentService;
    private BookService bookService;

    public LoginController(StudentService studentService, BookService bookService) {
        this.studentService = studentService;
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String showLoginPage(Model model){
        Account account = new Account();
        model.addAttribute("account",account);
        return "login/login";
    }

    @GetMapping("/student")
    public String showHomePage(@ModelAttribute("account")Account account, Model model){
        System.out.println(account.getAccountNumber());
        Student student = studentService.findById(account.getAccountNumber());
        model.addAttribute("student",student);
        List<Book> books = bookService.findAll();

        // add to the spring model
        model.addAttribute("books", books);
        return "homepage/books";
    }
    @GetMapping("/reserved")
    public String showReservedBooks(@ModelAttribute("student")Student student, Model model){
        // add to the spring model
//        int studentId = studentService.findById(accountId).getStudentNumber();

        model.addAttribute("reservedBooks",student.getBooks());
        return "homepage/reserved-books";
    }
//    @ExceptionHandler(EntityNotFoundException.class)
//    public String handleError() {
//        return "redirect:/login/";
//    }
}
