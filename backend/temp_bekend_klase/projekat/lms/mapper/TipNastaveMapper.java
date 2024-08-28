package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.TipNastaveDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.TipNastave;

@Mapper(componentModel = "spring")
public interface TipNastaveMapper extends BaseMapper<TipNastave, TipNastaveDTO, Long>{
	TipNastave toModel(TipNastaveDTO dto);
	
	TipNastaveDTO toDTO(TipNastave model);
}
