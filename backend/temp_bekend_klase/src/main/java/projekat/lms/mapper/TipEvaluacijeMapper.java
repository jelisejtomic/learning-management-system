package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.TipEvaluacijeDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.TipEvaluacije;

@Mapper(componentModel = "spring")
public interface TipEvaluacijeMapper extends BaseMapper<TipEvaluacije, TipEvaluacijeDTO, Long>{
	TipEvaluacije toModel(TipEvaluacijeDTO dto);
	
	TipEvaluacijeDTO toDTO(TipEvaluacije model);
}
