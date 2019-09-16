package cs.capstone.bookmanager.service;


import cs.capstone.bookmanager.dao.AccountRepository;
import cs.capstone.bookmanager.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

	private AccountRepository accountRepository;

	@Autowired
	public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
	}
	
	@Override
	public List<Account> findAll() {
		return accountRepository.findAll();
	}

	@Override
	public Account findById(int theId) {
		Optional<Account> result = accountRepository.findById(theId);

		Account account = null;

		if (result.isPresent()) {
			account = result.get();
		}
		else {
			// we didn't find the student
			throw new RuntimeException("Did not find student id - " + theId);
		}

		return account;
	}

	@Override
	public void save(Account account) {
        accountRepository.save(account);
	}

	@Override
	public void deleteById(int theId) {
        accountRepository.deleteById(theId);
	}

}






