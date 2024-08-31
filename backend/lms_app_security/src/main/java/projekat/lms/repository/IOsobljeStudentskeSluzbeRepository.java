package projekat.lms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.OsobljeStudentskeSluzbe;

@Repository
public interface IOsobljeStudentskeSluzbeRepository extends CrudRepository<OsobljeStudentskeSluzbe, Long> {
}
