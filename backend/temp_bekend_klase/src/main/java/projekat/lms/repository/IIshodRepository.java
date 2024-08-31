package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Ishod;

@Repository
public interface IIshodRepository extends CrudRepository<Ishod, Long>{
}
