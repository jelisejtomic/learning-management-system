package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.TipNastave;

@Repository
public interface ITipNastaveRepository extends CrudRepository<TipNastave, Long>{
}
