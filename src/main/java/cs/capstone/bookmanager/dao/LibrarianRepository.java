package cs.capstone.bookmanager.dao;

import cs.capstone.bookmanager.entity.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrarianRepository extends JpaRepository<Librarian,Integer> {
}
