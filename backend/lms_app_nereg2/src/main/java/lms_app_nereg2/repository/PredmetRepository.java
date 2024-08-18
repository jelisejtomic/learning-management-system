package lms_app_nereg2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lms_app_nereg2.model.Predmet;

@Repository
public interface PredmetRepository extends CrudRepository<Predmet, Long> {

}
