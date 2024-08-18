package lms_app_nereg2.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import lms_app_nereg2.dto.IshodDTO;
import lms_app_nereg2.dto.NastavniMaterijalDTO;
import lms_app_nereg2.dto.PredmetDTO;
import lms_app_nereg2.generics.BaseMapper;
import lms_app_nereg2.model.Ishod;
import lms_app_nereg2.model.NastavniMaterijal;
import lms_app_nereg2.model.Predmet;

@Mapper(componentModel = "spring")
public interface IshodMapper extends BaseMapper<Ishod, IshodDTO, Long> {
	Ishod toModel(IshodDTO dto);

	IshodDTO toDTO(Ishod model);
	
	@Mapping(target = "silabus", ignore = true)
	PredmetDTO toDTO(Predmet predmet);

	@Mapping(target = "ishod", ignore = true)
	NastavniMaterijalDTO toDTO(NastavniMaterijal nastavniMaterijal);
}
