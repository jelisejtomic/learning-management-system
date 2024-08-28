package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Fakultet;

@Repository
public interface IFakultetRepository extends CrudRepository<Fakultet, Long>{
}
