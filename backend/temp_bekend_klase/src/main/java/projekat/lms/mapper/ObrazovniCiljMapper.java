package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.ObrazovniCiljDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.ObrazovniCilj;

@Mapper(componentModel = "spring")
public interface ObrazovniCiljMapper extends BaseMapper<ObrazovniCilj, ObrazovniCiljDTO, Long>{
	ObrazovniCilj toModel(ObrazovniCiljDTO dto);
	
	ObrazovniCiljDTO toDTO(ObrazovniCilj model);
}
