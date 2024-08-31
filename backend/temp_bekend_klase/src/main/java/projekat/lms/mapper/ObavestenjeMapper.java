package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.ObavestenjeDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Obavestenje;

@Mapper(componentModel = "spring")
public interface ObavestenjeMapper  extends BaseMapper<Obavestenje, ObavestenjeDTO, Long>{
	Obavestenje toModel(ObavestenjeDTO dto);
	
	ObavestenjeDTO toDTO(Obavestenje model);
	
}
