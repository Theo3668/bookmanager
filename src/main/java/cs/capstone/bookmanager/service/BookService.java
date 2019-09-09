package cs.capstone.bookmanager.service;

import cs.capstone.bookmanager.entity.Book;

import java.util.List;

public interface BookService {

	public List<Book> findAll();
	
	public Book findById(int theId);
	
	public void save(Book book);
	
	public void deleteById(int theId);
	
}
