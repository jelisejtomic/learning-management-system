package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.NastavnikNaRealizaciji;

@Repository
public interface INastavnikNaRealizacijiRepository extends CrudRepository<NastavnikNaRealizaciji, Long>{
}
