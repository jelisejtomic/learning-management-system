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
public interface TerminNastaveMapper extends BaseMapper<TerminNastave, TerminNastaveDTO, Long>{
	TerminNastave toModel(TerminNastaveDTO dto);
	
	TerminNastaveDTO toDTO(TerminNastave model);
	
	@Mapping(target="terminiNastave", ignore=true)
	@Mapping(target="obavestenja", ignore=true)
	@Mapping(target="evaluacijeZnanja", ignore=true)
	RealizacijaPredmetaDTO toDTO(RealizacijaPredmeta model);
	
	@Mapping(target="tipNastave", ignore=true)
	@Mapping(target="realizacijaPredmeta", ignore=true)
	@Mapping(target="obavestenja", ignore=true)
	NastavnikNaRealizacijiDTO toDTO(NastavnikNaRealizaciji model);
}
