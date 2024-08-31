package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Polaganje;

@Repository
public interface IPolaganjeRepository extends CrudRepository<Polaganje, Long>{
}
