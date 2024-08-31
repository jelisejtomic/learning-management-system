package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.TipDokumenta;

@Repository
public interface ITipDokumentaRepository  extends CrudRepository<TipDokumenta, Long>{
}
