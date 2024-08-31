package projekat.lms.mapper;

import org.mapstruct.Mapper;

import projekat.lms.dto.UlogaDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Uloga;

@Mapper(componentModel = "spring")
public interface UlogaMapper extends BaseMapper<Uloga, UlogaDTO, Long> {
	Uloga toModel(UlogaDTO dto);

	UlogaDTO toDTO(Uloga model);

}
