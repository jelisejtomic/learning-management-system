package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Fajl;

@Repository
public interface IFajlRepository extends CrudRepository<Fajl, Long>{
}
