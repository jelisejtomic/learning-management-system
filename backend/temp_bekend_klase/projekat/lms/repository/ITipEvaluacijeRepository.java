package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.TipEvaluacije;

@Repository
public interface ITipEvaluacijeRepository extends CrudRepository<TipEvaluacije, Long>{
}
