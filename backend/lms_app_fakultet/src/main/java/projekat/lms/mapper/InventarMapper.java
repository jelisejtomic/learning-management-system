package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.InventarDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Inventar;

@Mapper(componentModel = "spring")
public interface InventarMapper extends BaseMapper<Inventar, InventarDTO, Long>{
	Inventar toModel(InventarDTO dto);
	
	InventarDTO toDTO(Inventar model);
}
