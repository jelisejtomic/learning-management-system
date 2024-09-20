package projekat.lms.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import projekat.lms.dto.EvaluacijaZnanjaDTO;
import projekat.lms.dto.NastavnikNaRealizacijiDTO;
import projekat.lms.dto.PolaganjeDTO;
import projekat.lms.dto.PrijavaIspitaDTO;
import projekat.lms.dto.RealizacijaPredmetaDTO;
import projekat.lms.dto.StudentDTO;
import projekat.lms.dto.StudentNaGodiniDTO;
import projekat.lms.dto.TerminNastaveDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.EvaluacijaZnanja;
import projekat.lms.model.NastavnikNaRealizaciji;
import projekat.lms.model.Polaganje;
import projekat.lms.model.PrijavaIspita;
import projekat.lms.model.RealizacijaPredmeta;
import projekat.lms.model.Student;
import projekat.lms.model.StudentNaGodini;
import projekat.lms.model.TerminNastave;

@Mapper(componentModel = "spring")
public interface RealizacijaPredmetaMapper extends BaseMapper<RealizacijaPredmeta, RealizacijaPredmetaDTO, Long> {
	RealizacijaPredmeta toModel(RealizacijaPredmetaDTO dto);

	RealizacijaPredmetaDTO toDTO(RealizacijaPredmeta model);

	@Mapping(target = "realizacijaPredmeta", ignore = true)
	@Mapping(target = "obavestenja", ignore = true)
	NastavnikNaRealizacijiDTO toDTO(NastavnikNaRealizaciji model);

	@Mapping(target = "realizacijaPredmeta", ignore = true)
	TerminNastaveDTO toDTO(TerminNastave model);

	// druge tabele: evaluacija znanja, nastavnik na realizaciji, termin nastave,
	// obavestenje, predmet, prijava ispita

	// dodate evaluacijeZnanja
	@Mapping(target = "polaganja", ignore = true)
	@Mapping(target = "ishod", ignore = true)
	@Mapping(target = "instrumentEvaluacije", ignore = true)
	EvaluacijaZnanjaDTO toDTO(EvaluacijaZnanja model);

	@Mapping(target = "evaluacijaZnanja", ignore = true)
	PolaganjeDTO toDTO(Polaganje model);

	// dodate prijaveIspita
	@Mapping(target = "realizacijaPredmeta", ignore = true)
	PrijavaIspitaDTO toDTO(PrijavaIspita prijavaIspita);

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
