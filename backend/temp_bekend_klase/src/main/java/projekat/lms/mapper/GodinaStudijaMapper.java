package projekat.lms.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import projekat.lms.dto.GodinaStudijaDTO;
import projekat.lms.dto.StudijskiProgramDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.GodinaStudija;
import projekat.lms.model.StudijskiProgram;

@Mapper(componentModel = "spring")
public interface GodinaStudijaMapper  extends BaseMapper<GodinaStudija, GodinaStudijaDTO, Long>{
	GodinaStudija toModel(GodinaStudijaDTO dto);
	
	GodinaStudijaDTO toDTO(GodinaStudija model);
	
	@Mapping(target="fakultet", ignore = true)
	@Mapping(target="godineStudija", ignore = true)
	@Mapping(target="rukovodilac", ignore = true)
	StudijskiProgramDTO toDTO(StudijskiProgram model);
	
	//druge tabele: predmet, studijski program
}
