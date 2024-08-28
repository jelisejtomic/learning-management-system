package projekat.lms.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import projekat.lms.dto.GodinaStudijaDTO;
import projekat.lms.dto.StudentDTO;
import projekat.lms.dto.StudentNaGodiniDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.GodinaStudija;
import projekat.lms.model.Student;
import projekat.lms.model.StudentNaGodini;

@Mapper(componentModel = "spring")
public interface StudentNaGodiniMapper  extends BaseMapper<StudentNaGodini, StudentNaGodiniDTO, Long>{
	StudentNaGodini toModel(StudentNaGodiniDTO dto);
	
	@Mapping(target="polaganja", ignore = true)
	@Mapping(target="odbranaZavrsnogRada", ignore = true)
	@Mapping(target="zavrsniRad", ignore = true)
	StudentNaGodiniDTO toDTO(StudentNaGodini model);
	
	@Mapping(target="adresa", ignore=true)
	@Mapping(target="studentiNaGodini", ignore=true)
	@Mapping(target="pohadjanjaPredmeta", ignore=true)
	StudentDTO toDTO(Student model);
	
	@Mapping(target="studijskiProgram", ignore=true)
	@Mapping(target="predmeti", ignore=true)
	GodinaStudijaDTO toDTO(GodinaStudija model);
	
}
