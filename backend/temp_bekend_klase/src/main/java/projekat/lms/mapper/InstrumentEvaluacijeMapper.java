package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.InstrumentEvaluacijeDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.InstrumentEvaluacije;

@Mapper(componentModel = "spring")
public interface InstrumentEvaluacijeMapper extends BaseMapper<InstrumentEvaluacije, InstrumentEvaluacijeDTO, Long>{
	InstrumentEvaluacije toModel(InstrumentEvaluacijeDTO dto);
	
	InstrumentEvaluacijeDTO toDTO(InstrumentEvaluacije model);
}
