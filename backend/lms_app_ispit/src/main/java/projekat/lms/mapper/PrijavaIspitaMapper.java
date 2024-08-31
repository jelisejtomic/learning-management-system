package projekat.lms.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import projekat.lms.dto.EvaluacijaZnanjaDTO;
import projekat.lms.dto.NastavnikNaRealizacijiDTO;
import projekat.lms.dto.PrijavaIspitaDTO;
import projekat.lms.dto.RealizacijaPredmetaDTO;
import projekat.lms.dto.StudentDTO;
import projekat.lms.dto.StudentNaGodiniDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.EvaluacijaZnanja;
import projekat.lms.model.NastavnikNaRealizaciji;
import projekat.lms.model.PrijavaIspita;
import projekat.lms.model.RealizacijaPredmeta;
import projekat.lms.model.Student;
import projekat.lms.model.StudentNaGodini;

@Mapper(componentModel = "spring")
public interface PrijavaIspitaMapper extends BaseMapper<PrijavaIspita, PrijavaIspitaDTO, Long> {
	PrijavaIspita toModel(PrijavaIspitaDTO dto);

	PrijavaIspitaDTO toDTO(PrijavaIspita model);

	@Mapping(target = "polaganja", ignore = true)
	@Mapping(target = "ishod", ignore = true)
	@Mapping(target = "instrumentEvaluacije", ignore = true)
	EvaluacijaZnanjaDTO toDTO(EvaluacijaZnanja model);

	@Mapping(target = "terminiNastave", ignore = true)
	@Mapping(target = "obavestenja", ignore = true)
	@Mapping(target = "evaluacijeZnanja", ignore = true)
	@Mapping(target = "prijaveIspita", ignore = true)
	RealizacijaPredmetaDTO toDTO(RealizacijaPredmeta model);

	@Mapping(target = "realizacijaPredmeta", ignore = true)
	@Mapping(target = "obavestenja", ignore = true)
//	@Mapping(target="evaluacijeZnanja", ignore = true)
	NastavnikNaRealizacijiDTO toDTO(NastavnikNaRealizaciji model);

	@Mapping(target = "godinaStudija", ignore = true)
	@Mapping(target = "polaganja", ignore = true)
	@Mapping(target = "odbranaZavrsnogRada", ignore = true)
	@Mapping(target = "zavrsniRad", ignore = true)
	@Mapping(target = "prijaveIspita", ignore = true)
	StudentNaGodiniDTO toDTO(StudentNaGodini model);

	@Mapping(target = "adresa", ignore = true)
	@Mapping(target = "studentNaGodinama", ignore = true)
	@Mapping(target = "pohadjanjaPredmeta", ignore = true)
	StudentDTO toDTO(Student student);
}
