package projekat.lms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Nastavnik;

@Repository
public interface INastavnikRepository extends CrudRepository<Nastavnik, Long> {
}
