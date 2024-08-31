package projekat.lms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.EvaluacijaZnanja;

@Repository
public interface IEvaluacijaZnanjaRepository extends CrudRepository<EvaluacijaZnanja, Long> {
}
