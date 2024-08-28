package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.StudijskiProgram;

@Repository
public interface IStudijskiProgramRepository  extends CrudRepository<StudijskiProgram, Long>{
}
