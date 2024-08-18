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
public interface UniverzitetMapper extends GenMapper<Univerzitet, UniverzitetDTO, Long>{
	Univerzitet toModel(UniverzitetDTO dto);
	
	UniverzitetDTO toDTO(Univerzitet model);
	
	@Mapping(target="univerzitet", ignore=true)
	FakultetDTO toDTO(Fakultet model);
	
	@Mapping(target="fakultet", ignore=true)
	StudijskiProgramDTO toDTO(StudijskiProgram model);
	
}
