package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.PredmetDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Predmet;

@Mapper(componentModel = "spring")
public interface PredmetMapper extends BaseMapper<Predmet, PredmetDTO, Long>{
	Predmet toModel(PredmetDTO dto);
	
	PredmetDTO toDTO(Predmet model);
	
}
