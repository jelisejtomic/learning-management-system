package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Inventar;

@Repository
public interface IInventarRepository extends CrudRepository<Inventar, Long>{
}
