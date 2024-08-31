package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.NastavniMaterijal;

@Repository
public interface INastavniMaterijalRepository extends CrudRepository<NastavniMaterijal, Long>{
}
