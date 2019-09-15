package cs.capstone.bookmanager.controller;

import cs.capstone.bookmanager.entity.Book;
import cs.capstone.bookmanager.entity.Student;
import cs.capstone.bookmanager.service.BookService;
import cs.capstone.bookmanager.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        List <Book> books = bookService.findAll();

        // add to the spring model
        model.addAttribute("books", books);
        return "login/login";
    }

    @GetMapping("/student")
    public String showHomePage(Model model){
        List <Book> books = bookService.findAll();

        // add to the spring model
        model.addAttribute("books", books);
        return "homepage/books";
    }
}
