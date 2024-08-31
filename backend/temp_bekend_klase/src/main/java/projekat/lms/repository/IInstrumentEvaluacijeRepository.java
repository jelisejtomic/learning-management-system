package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.InstrumentEvaluacije;

@Repository
public interface IInstrumentEvaluacijeRepository extends CrudRepository<InstrumentEvaluacije, Long>{
}
