package projekat.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.NastavnikNaRealizaciji;

@Repository
public interface INastavnikNaRealizacijiRepository extends CrudRepository<NastavnikNaRealizaciji, Long> {
	
	@Query("SELECT nr FROM NastavnikNaRealizaciji nr WHERE nr.predavac.id = :nastavnikId")
	List<NastavnikNaRealizaciji> findAllByNastavnikId(Long nastavnikId);
}
