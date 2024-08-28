package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.ZvanjeDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Zvanje;

@Mapper(componentModel = "spring")
public interface ZvanjeMapper extends BaseMapper<Zvanje, ZvanjeDTO, Long>{
	Zvanje toModel(ZvanjeDTO dto);
	
	ZvanjeDTO toDTO(Zvanje model);
	
}
