package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Predmet;

@Repository
public interface IPredmetRepository extends CrudRepository<Predmet, Long>{
}
