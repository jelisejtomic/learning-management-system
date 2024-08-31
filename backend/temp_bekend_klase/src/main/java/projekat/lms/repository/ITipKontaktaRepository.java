package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.TipKontakta;

@Repository
public interface ITipKontaktaRepository extends CrudRepository<TipKontakta, Long>{
}
