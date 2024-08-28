package projekat.lms.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import projekat.lms.dto.EvaluacijaZnanjaDTO;
import projekat.lms.dto.PolaganjeDTO;
import projekat.lms.dto.StudentDTO;
import projekat.lms.dto.StudentNaGodiniDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.EvaluacijaZnanja;
import projekat.lms.model.Polaganje;
import projekat.lms.model.Student;
import projekat.lms.model.StudentNaGodini;

@Mapper(componentModel = "spring")
public interface EvaluacijaZnanjaMapper extends BaseMapper<EvaluacijaZnanja, EvaluacijaZnanjaDTO, Long>{
	EvaluacijaZnanja toModel(EvaluacijaZnanjaDTO dto);
	
	EvaluacijaZnanjaDTO toDTO(EvaluacijaZnanja model);
	
	@Mapping(target="evaluacijaZnanja", ignore=true)
	PolaganjeDTO toDTO(Polaganje model);
	
	@Mapping(target="godinaStudija", ignore=true)
	@Mapping(target="odbranaZavrsnogRada", ignore=true)
	@Mapping(target="zavrsniRad", ignore=true)
	@Mapping(target="polaganja", ignore=true)
	StudentNaGodiniDTO toDTO(StudentNaGodini model);
	
	@Mapping(target="adresa", ignore = true)
	@Mapping(target="studentiNaGodini", ignore = true)
	@Mapping(target="pohadjanjaPredmeta", ignore = true)
	StudentDTO toDTO(Student model);

	//druge tabele: polaganje, ishod, tip evaluacije, instrument evaluacije
}
