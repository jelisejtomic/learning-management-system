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
public interface NastavniMaterijalMapper extends BaseMapper<NastavniMaterijal, NastavniMaterijalDTO, Long> {

	NastavniMaterijal toModel(NastavniMaterijalDTO dto);

	NastavniMaterijalDTO toDTO(NastavniMaterijal model);

	@Mapping(target = "nastavniMaterijal", ignore = true)
	IshodDTO toDTO(Ishod ishod);
	
	@Mapping(target = "silabus", ignore = true)
	PredmetDTO toDTO(Predmet predmet);

}
