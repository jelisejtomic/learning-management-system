package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.ZavrsniRadDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.ZavrsniRad;

@Mapper(componentModel = "spring")
public interface ZavrsniRadMapper extends BaseMapper<ZavrsniRad, ZavrsniRadDTO, Long>{
	ZavrsniRad toModel(ZavrsniRadDTO dto);
	
	ZavrsniRadDTO toDTO(ZavrsniRad model);
}
