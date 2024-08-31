package projekat.lms.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import projekat.lms.dto.NastavnikNaRealizacijiDTO;
import projekat.lms.dto.RealizacijaPredmetaDTO;
import projekat.lms.dto.TerminNastaveDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.NastavnikNaRealizaciji;
import projekat.lms.model.RealizacijaPredmeta;
import projekat.lms.model.TerminNastave;

@Mapper(componentModel = "spring")
public interface RealizacijaPredmetaMapper  extends BaseMapper<RealizacijaPredmeta, RealizacijaPredmetaDTO, Long>{
	RealizacijaPredmeta toModel(RealizacijaPredmetaDTO dto);
	
	@Mapping(target = "evaluacijeZnanja", ignore = true)
	@Mapping(target="prijaveIspita", ignore=true)
	RealizacijaPredmetaDTO toDTO(RealizacijaPredmeta model);
	
	@Mapping(target = "realizacijaPredmeta", ignore = true)
	@Mapping(target = "obavestenja", ignore = true)
	NastavnikNaRealizacijiDTO toDTO(NastavnikNaRealizaciji model);
	
	@Mapping(target = "realizacijaPredmeta", ignore = true)
	TerminNastaveDTO toDTO(TerminNastave model);
		
	// druge tabele: evaluacija znanja, nastavnik na realizaciji, termin nastave, obavestenje, predmet, prijava ispita
}
