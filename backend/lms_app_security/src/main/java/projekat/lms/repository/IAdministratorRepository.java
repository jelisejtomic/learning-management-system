package projekat.lms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Administrator;

@Repository
public interface IAdministratorRepository extends CrudRepository<Administrator, Long> {

	@Query("SELECT a FROM Administrator a WHERE a.korisnik.korisnickoIme = :username")
	Optional<Administrator> findByUsername(String username);
}
