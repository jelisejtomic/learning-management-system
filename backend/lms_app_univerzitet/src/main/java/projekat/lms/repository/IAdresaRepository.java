package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Adresa;

@Repository
public interface IAdresaRepository extends CrudRepository<Adresa, Long>{
}
