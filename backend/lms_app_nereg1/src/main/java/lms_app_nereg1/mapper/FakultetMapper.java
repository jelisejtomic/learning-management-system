package lms_app_nereg1.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import lms_app_nereg1.dto.FakultetDTO;
import lms_app_nereg1.dto.StudijskiProgramDTO;
import lms_app_nereg1.dto.UniverzitetDTO;
import lms_app_nereg1.generics.GenMapper;
import lms_app_nereg1.model.Fakultet;
import lms_app_nereg1.model.StudijskiProgram;
import lms_app_nereg1.model.Univerzitet;

@Mapper(componentModel = "spring")
public interface FakultetMapper extends GenMapper<Fakultet, FakultetDTO, Long>{
	Fakultet toModel(FakultetDTO dto);
	
	FakultetDTO toDTO(Fakultet model);
	
	@Mapping(target="fakultet", ignore = true)
	StudijskiProgramDTO toDTO(StudijskiProgram model);
	
	@Mapping(target="fakulteti", ignore = true)
	UniverzitetDTO toDTO(Univerzitet model);
}
