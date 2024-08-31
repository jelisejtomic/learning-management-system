package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.DokumentDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Dokument;

@Mapper(componentModel = "spring")
public interface DokumentMapper extends BaseMapper<Dokument, DokumentDTO, Long>{
	Dokument toModel(DokumentDTO dto);
	
	DokumentDTO toDTO(Dokument model);
}
