package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Obavestenje;

@Repository
public interface IObavestenjeRepository extends CrudRepository<Obavestenje, Long>{
}
