package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.AdministratorDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Administrator;

@Mapper(componentModel = "spring")
public interface AdministratorMapper  extends BaseMapper<Administrator, AdministratorDTO, Long>{
	Administrator toModel(AdministratorDTO dto);
	
	AdministratorDTO toDTO(Administrator model);
}
