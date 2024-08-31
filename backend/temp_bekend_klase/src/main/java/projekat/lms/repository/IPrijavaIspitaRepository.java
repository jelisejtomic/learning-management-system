package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.PrijavaIspita;

@Repository
public interface IPrijavaIspitaRepository extends CrudRepository<PrijavaIspita, Long>{
}
