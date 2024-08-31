package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.RealizacijaPredmeta;

@Repository
public interface IRealizacijaPredmetaRepository extends CrudRepository<RealizacijaPredmeta, Long>{
}
