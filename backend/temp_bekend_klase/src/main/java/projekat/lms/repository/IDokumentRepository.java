package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Dokument;

@Repository
public interface IDokumentRepository extends CrudRepository<Dokument, Long>{
}
