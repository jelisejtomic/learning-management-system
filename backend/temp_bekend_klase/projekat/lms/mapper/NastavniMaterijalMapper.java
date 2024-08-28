package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.NastavniMaterijalDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.NastavniMaterijal;

@Mapper(componentModel = "spring")
public interface NastavniMaterijalMapper extends BaseMapper<NastavniMaterijal, NastavniMaterijalDTO, Long>{
	NastavniMaterijal toModel(NastavniMaterijalDTO dto);
	
	NastavniMaterijalDTO toDTO(NastavniMaterijal model);
	
}
