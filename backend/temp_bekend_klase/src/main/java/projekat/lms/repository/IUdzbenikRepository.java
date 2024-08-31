package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Udzbenik;

@Repository
public interface IUdzbenikRepository extends CrudRepository<Udzbenik, Long>{
}
