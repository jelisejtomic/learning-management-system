package projekat.lms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.NaucnaOblast;

@Repository
public interface INaucnaOblastRepository extends CrudRepository<NaucnaOblast, Long> {
}
