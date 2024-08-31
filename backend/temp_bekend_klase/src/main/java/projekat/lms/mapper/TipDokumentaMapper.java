package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.TipDokumentaDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.TipDokumenta;

@Mapper(componentModel = "spring")
public interface TipDokumentaMapper extends BaseMapper<TipDokumenta, TipDokumentaDTO, Long>{
	TipDokumenta toModel(TipDokumentaDTO dto);
	
	TipDokumentaDTO toDTO(TipDokumenta model);
}
