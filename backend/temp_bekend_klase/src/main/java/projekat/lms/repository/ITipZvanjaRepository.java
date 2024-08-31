package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.TipZvanja;

@Repository
public interface ITipZvanjaRepository extends CrudRepository<TipZvanja, Long>{
}
