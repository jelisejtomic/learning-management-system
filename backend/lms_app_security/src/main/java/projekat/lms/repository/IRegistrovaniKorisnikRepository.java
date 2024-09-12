package projekat.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.RegistrovaniKorisnik;

@Repository
public interface IRegistrovaniKorisnikRepository extends CrudRepository<RegistrovaniKorisnik, Long> {

	@Query("SELECT rk FROM RegistrovaniKorisnik rk WHERE rk.koriscnikoIme = :username")
	Optional<RegistrovaniKorisnik> findByUsername(String username);
}
