package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Uloga;

@Repository
public interface IUlogaRepository extends CrudRepository<Uloga, Long>{
}
