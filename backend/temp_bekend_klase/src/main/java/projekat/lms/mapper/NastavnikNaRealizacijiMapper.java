package projekat.lms.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import projekat.lms.dto.NastavnikNaRealizacijiDTO;
import projekat.lms.dto.PredmetDTO;
import projekat.lms.dto.RealizacijaPredmetaDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.NastavnikNaRealizaciji;
import projekat.lms.model.Predmet;
import projekat.lms.model.RealizacijaPredmeta;

@Mapper(componentModel = "spring")
public interface NastavnikNaRealizacijiMapper  extends BaseMapper<NastavnikNaRealizaciji, NastavnikNaRealizacijiDTO, Long>{
	NastavnikNaRealizaciji toModel(NastavnikNaRealizacijiDTO dto);
	
	NastavnikNaRealizacijiDTO toDTO(NastavnikNaRealizaciji model);
	
	@Mapping(target="nastavnici", ignore = true)
	@Mapping(target="terminiNastave", ignore = true)
	@Mapping(target="obavestenja", ignore = true)
	@Mapping(target="evaluacijeZnanja", ignore = true)
	@Mapping(target="prijaveIspita", ignore=true)
	RealizacijaPredmetaDTO toDTO(RealizacijaPredmeta model);
	
//	mozda skloniti preduslov?
	PredmetDTO toDTO(Predmet model);
	
	//druge tabele: nastavnik, tip nastave, realizacija predmeta, obavestenje
	
}
