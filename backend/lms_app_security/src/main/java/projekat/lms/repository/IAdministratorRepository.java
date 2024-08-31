package projekat.lms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Administrator;

@Repository
public interface IAdministratorRepository extends CrudRepository<Administrator, Long> {
}
