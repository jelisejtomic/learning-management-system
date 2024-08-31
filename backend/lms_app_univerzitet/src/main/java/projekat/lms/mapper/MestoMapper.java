package projekat.lms.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import projekat.lms.dto.DrzavaDTO;
import projekat.lms.dto.MestoDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Drzava;
import projekat.lms.model.Mesto;

@Mapper(componentModel = "spring")
public interface MestoMapper  extends BaseMapper<Mesto, MestoDTO, Long>{
	Mesto toModel(MestoDTO dto);
	
	MestoDTO toDTO(Mesto model);

	@Mapping(target = "mesta", ignore = true)
	DrzavaDTO toDTO(Drzava model);
	
}
