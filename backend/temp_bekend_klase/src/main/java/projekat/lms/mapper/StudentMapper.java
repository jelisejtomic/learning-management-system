package projekat.lms.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import projekat.lms.dto.DrzavaDTO;
import projekat.lms.dto.EvaluacijaZnanjaDTO;
import projekat.lms.dto.NastavnikNaRealizacijiDTO;
import projekat.lms.dto.PohadjanjePredmetaDTO;
import projekat.lms.dto.PolaganjeDTO;
import projekat.lms.dto.RealizacijaPredmetaDTO;
import projekat.lms.dto.StudentDTO;
import projekat.lms.dto.StudentNaGodiniDTO;
import projekat.lms.dto.StudijskiProgramDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Drzava;
import projekat.lms.model.EvaluacijaZnanja;
import projekat.lms.model.NastavnikNaRealizaciji;
import projekat.lms.model.PohadjanjePredmeta;
import projekat.lms.model.Polaganje;
import projekat.lms.model.RealizacijaPredmeta;
import projekat.lms.model.Student;
import projekat.lms.model.StudentNaGodini;
import projekat.lms.model.StudijskiProgram;

@Mapper(componentModel = "spring")
public interface StudentMapper extends BaseMapper<Student, StudentDTO, Long>{
	Student toModel(StudentDTO dto);
	
	StudentDTO toDTO(Student model);

	@Mapping(target = "mesta", ignore = true)
	DrzavaDTO toDTO(Drzava model);
	
	@Mapping(target = "student", ignore = true)
	@Mapping(target = "zavrsniRad", ignore = true)
	@Mapping(target="prijaveIspita", ignore = true)
	StudentNaGodiniDTO toDTO(StudentNaGodini model);
	
	@Mapping(target="fakultet", ignore=true)
	@Mapping(target="rukovodilac", ignore=true)
	@Mapping(target="godineStudija", ignore=true)
	StudijskiProgramDTO toDTO(StudijskiProgram model);
	
	@Mapping(target="studentNaGodini", ignore=true)
	PolaganjeDTO toDTO(Polaganje model);
	
	@Mapping(target="polaganja", ignore=true)
	EvaluacijaZnanjaDTO toDTO(EvaluacijaZnanja model);
	
	@Mapping(target="student", ignore=true)
	PohadjanjePredmetaDTO toDTO(PohadjanjePredmeta model);
	
	@Mapping(target="terminiNastave", ignore=true)
//	@Mapping(target="obavestenja", ignore=true)
	@Mapping(target="evaluacijeZnanja", ignore=true)
	@Mapping(target="prijaveIspita", ignore=true)
	RealizacijaPredmetaDTO toDTO(RealizacijaPredmeta model);
	
	@Mapping(target="realizacijaPredmeta", ignore=true)
	NastavnikNaRealizacijiDTO toDTO(NastavnikNaRealizaciji model);
	
	//TODO ovo dobro proveriti (da li ipak izlistati i sve prijave ispita?)
	
	// druge tabele: adresa, student na godini, pohadjanje predmeta
}
