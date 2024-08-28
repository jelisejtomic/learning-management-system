package projekat.lms.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekat.lms.model.ObrazovniCilj;

@Repository
public interface IObrazovniCiljRepository  extends CrudRepository<ObrazovniCilj, Long>{
}
