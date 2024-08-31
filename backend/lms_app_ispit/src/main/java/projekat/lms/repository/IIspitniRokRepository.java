package projekat.lms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.IspitniRok;

@Repository
public interface IIspitniRokRepository extends CrudRepository<IspitniRok, Long> {
}
