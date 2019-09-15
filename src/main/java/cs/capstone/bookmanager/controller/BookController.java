package cs.capstone.bookmanager.controller;


import cs.capstone.bookmanager.entity.Book;
import cs.capstone.bookmanager.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

	private BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	// add mapping for "/list"
	@GetMapping("/list")
	public String listBooks(Model model) {

		List <Book> books = bookService.findAll();
		
		// add to the spring model
		model.addAttribute("books", books);
		
		return "books/list-books";
	}
	@GetMapping("/listt")
	public String displayBooks(Model model) {

		List <Book> books = bookService.findAll();

		// add to the spring model
		model.addAttribute("books", books);

		return "books/books";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model){
		Book book = new Book();
		model.addAttribute("book",book);

		return "books/book-form";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("bookId")int bookId, Model model){

//		get the book from the service/db
		Book book = bookService.findById(bookId);

//		set book as a model attribute to pre-populate the form
		model.addAttribute("book",book);


		model.addAttribute("book",book);
//		send over to our form
		return "books/book-form";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("bookId")int bookId, Model model){
//		delete the book
		bookService.deleteById(bookId);

//		redirect to books/list
		return "redirect:/books/list";
	}
	@PostMapping("/save")
	public String saveBook(@ModelAttribute("book") Book book){
//		save the book
		bookService.save(book);

//		use a redirect to prevent duplicate submissions
		return "redirect:/books/list";
	}
}









