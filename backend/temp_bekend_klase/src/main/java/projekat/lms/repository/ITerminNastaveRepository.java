package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.TerminNastave;

@Repository
public interface ITerminNastaveRepository extends CrudRepository<TerminNastave, Long>{
}
