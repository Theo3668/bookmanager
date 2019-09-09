package cs.capstone.bookmanager.dao;
import cs.capstone.bookmanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
