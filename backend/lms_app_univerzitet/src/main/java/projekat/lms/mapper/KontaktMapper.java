package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.KontaktDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Kontakt;

@Mapper(componentModel = "spring")
public interface KontaktMapper  extends BaseMapper<Kontakt, KontaktDTO, Long>{
	Kontakt toModel(KontaktDTO dto);
	
	KontaktDTO toDTO(Kontakt model);
	
}
