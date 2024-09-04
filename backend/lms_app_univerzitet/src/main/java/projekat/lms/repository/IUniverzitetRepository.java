package projekat.lms.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import projekat.lms.model.Nastavnik;
import projekat.lms.model.Univerzitet;

@Repository
public interface IUniverzitetRepository extends CrudRepository<Univerzitet, Long>{
	
    @Query("SELECT DISTINCT n FROM Nastavnik n " +
            "JOIN Fakultet f ON f.dekan.id = n.id " +
            "WHERE f.univerzitet.id = :univerzitetId " +
            "UNION " +
            "SELECT DISTINCT n FROM Nastavnik n " +
            "JOIN StudijskiProgram sp ON sp.rukovodilac.id = n.id " +
            "JOIN Fakultet f ON sp.fakultet.id = f.id " +
            "WHERE f.univerzitet.id = :univerzitetId " +
            "UNION " +
            "SELECT DISTINCT n FROM Nastavnik n " +
            "JOIN NastavnikNaRealizaciji nr ON nr.predavac.id = n.id " +
            "JOIN RealizacijaPredmeta rp ON rp.id = nr.realizacijaPredmeta.id " +
            "JOIN Predmet p ON p.id = rp.predmet.id " +
            "JOIN GodinaStudija gs ON gs.id = p.id " +
            "JOIN StudijskiProgram sp ON gs.studijskiProgram.id = sp.id " +
            "JOIN Fakultet f ON sp.fakultet.id = f.id " +
            "WHERE f.univerzitet.id = :univerzitetId")
     List<Nastavnik> findAllNastavniciByUniverzitetId(@Param("univerzitetId") Long univerzitetId);
}
