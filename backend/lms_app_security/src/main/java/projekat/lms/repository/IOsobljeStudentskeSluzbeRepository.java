package projekat.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.OsobljeStudentskeSluzbe;

@Repository
public interface IOsobljeStudentskeSluzbeRepository extends CrudRepository<OsobljeStudentskeSluzbe, Long> {
	@Query("SELECT oss FROM OsobljeStudentskeSluzbe oss WHERE oss.korisnik.koriscnikoIme = :username")
	Optional<OsobljeStudentskeSluzbe> findByUsername(String username);
}
