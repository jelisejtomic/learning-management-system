package projekat.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Nastavnik;

@Repository
public interface INastavnikRepository extends CrudRepository<Nastavnik, Long> {

	@Query("SELECT n FROM Nastavnik n WHERE n.korisnik.koriscnikoIme = :username")
	Optional<Nastavnik> findByUsername(String username);
}
