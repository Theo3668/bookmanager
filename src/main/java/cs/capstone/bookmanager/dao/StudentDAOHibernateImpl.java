package cs.capstone.bookmanager.dao;

import cs.capstone.bookmanager.entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentDAOHibernateImpl implements StudentDAO {

    // define field for entitymanager
    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public StudentDAOHibernateImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Student> findAll() {
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // create a query
        Query<Student> theQuery =
                currentSession.createQuery("from Student", Student.class);

        // execute query and get result list
        List<Student> students = theQuery.getResultList();

        // return the results
        return students;
    }

    @Override
    public Student findById(int studentNumber) {
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // get the student
        Student theStudent =
                currentSession.get(Student.class, studentNumber);

        // return the student
        return theStudent;
    }

    @Override
    public void save(Student theStudent) {

        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // save student
        currentSession.saveOrUpdate(theStudent);

    }

    @Override
    public void deleteById(int studentNumber) {
        // get the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        // delete object with primary key
        Query theQuery =
                currentSession.createQuery(
                        "delete from Student where student_number=:studentNumber");
        theQuery.setParameter("studentNumber", studentNumber);

        theQuery.executeUpdate();

    }
}
