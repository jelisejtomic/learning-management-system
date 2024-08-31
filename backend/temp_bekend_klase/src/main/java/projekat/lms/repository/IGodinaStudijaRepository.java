package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.GodinaStudija;

@Repository
public interface IGodinaStudijaRepository extends CrudRepository<GodinaStudija, Long>{
}
