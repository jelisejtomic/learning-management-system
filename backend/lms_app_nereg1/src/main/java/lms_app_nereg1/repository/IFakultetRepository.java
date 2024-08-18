package lms_app_nereg1.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lms_app_nereg1.model.Fakultet;

@Repository
public interface IFakultetRepository extends CrudRepository<Fakultet, Long>{
}
