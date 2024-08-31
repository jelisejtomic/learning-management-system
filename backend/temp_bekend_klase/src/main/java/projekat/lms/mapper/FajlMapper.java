package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.FajlDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Fajl;

@Mapper(componentModel = "spring")
public interface FajlMapper extends BaseMapper<Fajl, FajlDTO, Long>{
	Fajl toModel(FajlDTO dto);
	
	FajlDTO toDTO(Fajl model);
	
}
