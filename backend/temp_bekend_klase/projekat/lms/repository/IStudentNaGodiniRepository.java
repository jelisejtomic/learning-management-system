package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.StudentNaGodini;

@Repository
public interface IStudentNaGodiniRepository extends CrudRepository<StudentNaGodini, Long>{
}
