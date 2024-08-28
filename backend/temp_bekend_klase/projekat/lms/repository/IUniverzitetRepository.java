package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Univerzitet;

@Repository
public interface IUniverzitetRepository extends CrudRepository<Univerzitet, Long>{
}
