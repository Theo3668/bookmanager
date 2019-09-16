package cs.capstone.bookmanager.service;

import cs.capstone.bookmanager.entity.Account;
import cs.capstone.bookmanager.entity.Book;

import java.util.List;

public interface AccountService {

	public List<Account> findAll();
	
	public Account findById(int theId);
	
	public void save(Account book);
	
	public void deleteById(int theId);
	
}
