package projekat.lms.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import projekat.lms.dto.DrzavaDTO;
import projekat.lms.dto.FakultetDTO;
import projekat.lms.dto.GodinaStudijaDTO;
import projekat.lms.dto.StudijskiProgramDTO;
import projekat.lms.dto.UniverzitetDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Drzava;
import projekat.lms.model.Fakultet;
import projekat.lms.model.GodinaStudija;
import projekat.lms.model.StudijskiProgram;
import projekat.lms.model.Univerzitet;

@Mapper(componentModel = "spring")
public interface StudijskiProgramMapper  extends BaseMapper<StudijskiProgram, StudijskiProgramDTO, Long>{
	StudijskiProgram toModel(StudijskiProgramDTO dto);
	
	StudijskiProgramDTO toDTO(StudijskiProgram model);

	@Mapping(target = "mesta", ignore = true)
	DrzavaDTO toDTO(Drzava model);
	
	@Mapping(target = "studijskiProgrami", ignore = true)
	FakultetDTO toDTO(Fakultet model);
	
	@Mapping(target = "fakulteti", ignore = true)
	UniverzitetDTO toDTO(Univerzitet model);
	
	@Mapping(target="studijskiProgram", ignore = true)
	GodinaStudijaDTO toDTO(GodinaStudija model);
}
