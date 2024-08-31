package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Mesto;

@Repository
public interface IMestoRepository extends CrudRepository<Mesto, Long>{
}
