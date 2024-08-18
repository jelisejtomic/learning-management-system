package lms_app_nereg1.mapper;
import org.mapstruct.Mapper;
//import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;

import lms_app_nereg1.dto.FakultetDTO;
import lms_app_nereg1.dto.StudijskiProgramDTO;
import lms_app_nereg1.dto.UniverzitetDTO;
import lms_app_nereg1.generics.GenMapper;
import lms_app_nereg1.model.Fakultet;
import lms_app_nereg1.model.StudijskiProgram;
import lms_app_nereg1.model.Univerzitet;

@Mapper(componentModel = "spring")
public interface StudijskiProgramMapper extends GenMapper<StudijskiProgram, StudijskiProgramDTO, Long>{
//	StudijskiProgramMapper STUDIJSKI_PROGRAM_MAPPER = Mappers.getMapper(StudijskiProgramMapper.class);
	
	StudijskiProgram toModel(StudijskiProgramDTO studijskiProgramDTO);
	
	StudijskiProgramDTO toDTO(StudijskiProgram studijskiProgram);
	
	@Mapping(target = "studijskiProgrami", ignore=true)
	FakultetDTO toDTO(Fakultet model);
	
	@Mapping(target = "fakulteti", ignore=true)
	UniverzitetDTO toDTO(Univerzitet model);
}
