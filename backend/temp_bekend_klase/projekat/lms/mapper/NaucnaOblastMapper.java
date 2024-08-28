package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.NaucnaOblastDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.NaucnaOblast;

@Mapper(componentModel = "spring")
public interface NaucnaOblastMapper extends BaseMapper<NaucnaOblast, NaucnaOblastDTO, Long>{
	NaucnaOblast toModel(NaucnaOblastDTO dto);
	
	NaucnaOblastDTO toDTO(NaucnaOblast model);
	
}
