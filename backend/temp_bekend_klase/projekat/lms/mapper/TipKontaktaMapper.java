package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.TipKontaktaDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.TipKontakta;

@Mapper(componentModel = "spring")
public interface TipKontaktaMapper  extends BaseMapper<TipKontakta, TipKontaktaDTO, Long>{
	TipKontakta toModel(TipKontaktaDTO dto);
	
	TipKontaktaDTO toDTO(TipKontakta model);
	
}
