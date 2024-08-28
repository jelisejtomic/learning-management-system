package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.IshodDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Ishod;

@Mapper(componentModel = "spring")
public interface IshodMapper  extends BaseMapper<Ishod, IshodDTO, Long>{
	Ishod toModel(IshodDTO dto);
	
	IshodDTO toDTO(Ishod model);
	
}
