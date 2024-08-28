package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.RegistrovaniKorisnik;

@Repository
public interface IRegistrovaniKorisnikRepository extends CrudRepository<RegistrovaniKorisnik, Long>{
}
