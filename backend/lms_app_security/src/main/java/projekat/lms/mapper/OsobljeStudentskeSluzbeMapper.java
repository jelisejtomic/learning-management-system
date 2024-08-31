package projekat.lms.mapper;

import org.mapstruct.Mapper;

import projekat.lms.dto.OsobljeStudentskeSluzbeDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.OsobljeStudentskeSluzbe;

@Mapper(componentModel = "spring")
public interface OsobljeStudentskeSluzbeMapper
		extends BaseMapper<OsobljeStudentskeSluzbe, OsobljeStudentskeSluzbeDTO, Long> {
	OsobljeStudentskeSluzbe toModel(OsobljeStudentskeSluzbeDTO dto);

	OsobljeStudentskeSluzbeDTO toDTO(OsobljeStudentskeSluzbe model);
}
