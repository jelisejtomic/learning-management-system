package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.PohadjanjePredmeta;

@Repository
public interface IPohadjanjePredmetaRepository extends CrudRepository<PohadjanjePredmeta, Long>{
}
