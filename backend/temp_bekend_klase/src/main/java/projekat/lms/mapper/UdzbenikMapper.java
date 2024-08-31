package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.UdzbenikDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Udzbenik;

@Mapper(componentModel = "spring")
public interface UdzbenikMapper extends BaseMapper<Udzbenik, UdzbenikDTO, Long>{
	Udzbenik toModel(UdzbenikDTO dto);
	
	UdzbenikDTO toDTO(Udzbenik model);
}
