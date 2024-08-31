package projekat.lms.mapper;

import org.mapstruct.Mapper;

import projekat.lms.dto.RegistrovaniKorisnikDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.RegistrovaniKorisnik;

@Mapper(componentModel = "spring")
public interface RegistrovaniKorisnikMapper extends BaseMapper<RegistrovaniKorisnik, RegistrovaniKorisnikDTO, Long> {
	RegistrovaniKorisnik toModel(RegistrovaniKorisnikDTO dto);

	RegistrovaniKorisnikDTO toDTO(RegistrovaniKorisnik model);

}
