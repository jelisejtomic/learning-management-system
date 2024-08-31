package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Drzava;

@Repository
public interface IDrzavaRepository extends CrudRepository<Drzava, Long>{
}
