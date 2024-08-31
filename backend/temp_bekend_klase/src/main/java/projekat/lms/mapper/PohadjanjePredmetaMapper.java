package projekat.lms.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import projekat.lms.dto.PohadjanjePredmetaDTO;
import projekat.lms.dto.PredmetDTO;
import projekat.lms.dto.RealizacijaPredmetaDTO;
import projekat.lms.dto.StudentDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.PohadjanjePredmeta;
import projekat.lms.model.Predmet;
import projekat.lms.model.RealizacijaPredmeta;
import projekat.lms.model.Student;

@Mapper(componentModel = "spring")
public interface PohadjanjePredmetaMapper  extends BaseMapper<PohadjanjePredmeta, PohadjanjePredmetaDTO, Long>{
	PohadjanjePredmeta toModel(PohadjanjePredmetaDTO dto);
	
	PohadjanjePredmetaDTO toDTO(PohadjanjePredmeta model);
	
	@Mapping(target="nastavnici", ignore = true)
	@Mapping(target="terminiNastave", ignore = true)
	@Mapping(target="obavestenja", ignore = true)
	@Mapping(target="evaluacijeZnanja", ignore = true)
	@Mapping(target="prijaveIspita", ignore=true)
	RealizacijaPredmetaDTO toDTO(RealizacijaPredmeta model);
	
	@Mapping(target="preduslov", ignore = true)
	PredmetDTO toDTO(Predmet model);
	
	@Mapping(target="adresa", ignore = true)
	@Mapping(target="studentNaGodinama", ignore = true)
	@Mapping(target="pohadjanjaPredmeta", ignore = true)
	StudentDTO toDTO(Student model);
	
}
