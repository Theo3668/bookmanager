package cs.capstone.bookmanager.service;

import cs.capstone.bookmanager.dao.BookRepository;
import cs.capstone.bookmanager.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository bookRepository;

	@Autowired
	public BookServiceImpl(BookRepository bookRepository) {
        bookRepository = bookRepository;
	}
	
	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book findById(int theId) {
		Optional<Book> result = bookRepository.findById(theId);

		Book book = null;
		
		if (result.isPresent()) {
			book = result.get();
		}
		else {
			// we didn't find the book
			throw new RuntimeException("Did not find book id - " + theId);
		}
		
		return book;
	}

	@Override
	public void save(Book book) {
        bookRepository.save(book);
	}

	@Override
	public void deleteById(int theId) {
        bookRepository.deleteById(theId);
	}

}






