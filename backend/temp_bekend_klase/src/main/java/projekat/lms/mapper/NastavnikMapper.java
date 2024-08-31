package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.NastavnikDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Nastavnik;

@Mapper(componentModel = "spring")
public interface NastavnikMapper  extends BaseMapper<Nastavnik, NastavnikDTO, Long>{
	Nastavnik toModel(NastavnikDTO dto);
	
	NastavnikDTO toDTO(Nastavnik model);
}
