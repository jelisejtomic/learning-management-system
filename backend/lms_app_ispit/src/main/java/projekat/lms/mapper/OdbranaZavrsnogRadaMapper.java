package projekat.lms.mapper;

import org.mapstruct.Mapper;

import projekat.lms.dto.OdbranaZavrsnogRadaDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.OdbranaZavrsnogRada;

@Mapper(componentModel = "spring")
public interface OdbranaZavrsnogRadaMapper extends BaseMapper<OdbranaZavrsnogRada, OdbranaZavrsnogRadaDTO, Long> {
	OdbranaZavrsnogRada toModel(OdbranaZavrsnogRadaDTO dto);

	OdbranaZavrsnogRadaDTO toDTO(OdbranaZavrsnogRada model);
}
