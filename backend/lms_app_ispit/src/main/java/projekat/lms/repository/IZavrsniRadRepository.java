package projekat.lms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.ZavrsniRad;

@Repository
public interface IZavrsniRadRepository extends CrudRepository<ZavrsniRad, Long> {
}
