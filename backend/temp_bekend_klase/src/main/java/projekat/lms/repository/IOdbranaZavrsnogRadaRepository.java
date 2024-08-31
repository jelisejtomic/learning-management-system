package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.OdbranaZavrsnogRada;

@Repository
public interface IOdbranaZavrsnogRadaRepository extends CrudRepository<OdbranaZavrsnogRada, Long>{
}
