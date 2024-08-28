package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.TipZvanjaDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.TipZvanja;

@Mapper(componentModel = "spring")
public interface TipZvanjaMapper  extends BaseMapper<TipZvanja, TipZvanjaDTO, Long>{
	TipZvanja toModel(TipZvanjaDTO dto);
	
	TipZvanjaDTO toDTO(TipZvanja model);
	
}
