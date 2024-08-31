package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Kontakt;

@Repository
public interface IKontaktRepository extends CrudRepository<Kontakt, Long>{
}
