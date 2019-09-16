package cs.capstone.bookmanager.controller;


import cs.capstone.bookmanager.entity.Account;
import cs.capstone.bookmanager.service.AccountService;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/accounts")
public class AccountController {

	private AccountService accountService;

	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}

	// add mapping for "/list"
	@GetMapping("/list")
	public String listAccounts(Model model) {

		List <Account> accounts = accountService.findAll();
		
		// add to the spring model
		model.addAttribute("accounts", accounts);
		
		return "accounts/list-accounts";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model){
		Account account = new Account();
		model.addAttribute("account",account);

		return "accounts/account-form";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("accountId")int accountId, Model model){

//		get the account from the service/db
		Account account = accountService.findById(accountId);

//		set account as a model attribute to pre-populate the form
		model.addAttribute("account",account);
//		send over to our form
		return "accounts/account-form";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("accountId")int accountId, Model model){
//		delete the account
		accountService.deleteById(accountId);

//		redirect to accounts/list
		return "redirect:/accounts/list";
	}
	@PostMapping("/save")
	public String saveAccount(@ModelAttribute("account") Account account){
//		save the account
		accountService.save(account);

//		use a redirect to prevent duplicate submissions
		return "redirect:/accounts/list";
	}
	@ExceptionHandler(ConstraintViolationException.class)
	public String handleError() {
		return "redirect:/accounts/list";
	}
}









