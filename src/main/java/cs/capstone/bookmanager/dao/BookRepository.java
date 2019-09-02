package cs.capstone.bookmanager.dao;

import cs.capstone.bookmanager.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Account,Integer> {
}
