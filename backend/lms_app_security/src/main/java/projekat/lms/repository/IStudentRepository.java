package projekat.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Student;

@Repository
public interface IStudentRepository extends CrudRepository<Student, Long> {
	
    @Query("SELECT s FROM Student s WHERE s.korisnik.korisnickoIme = :username")
	Optional<Student> findByUsername(String username);
}
