package projekat.lms.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import projekat.lms.dto.DrzavaDTO;
import projekat.lms.dto.FakultetDTO;
import projekat.lms.dto.StudijskiProgramDTO;
import projekat.lms.dto.UniverzitetDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Drzava;
import projekat.lms.model.Fakultet;
import projekat.lms.model.StudijskiProgram;
import projekat.lms.model.Univerzitet;

@Mapper(componentModel = "spring")
public interface FakultetMapper extends BaseMapper<Fakultet, FakultetDTO, Long>{
	Fakultet toModel(FakultetDTO dto);
	
	FakultetDTO toDTO(Fakultet model);
	
	@Mapping(target="fakulteti", ignore = true)
	@Mapping(target="kontakti", ignore = true)
	@Mapping(target="adrese", ignore = true)
	@Mapping(target="rektor", ignore = true)
	UniverzitetDTO toDTO(Univerzitet model);
	
	@Mapping(target="fakultet", ignore = true)
	@Mapping(target="godineStudija", ignore = true)
	@Mapping(target="rukovodilac", ignore = true)
	StudijskiProgramDTO toDTO(StudijskiProgram model);
	
	//za adresu
	@Mapping(target = "mesta", ignore = true)
	DrzavaDTO toDTO(Drzava model);
	
	//druge tabele: adresa, kontakt, univerzitet, studijski program, nastavnik
}
