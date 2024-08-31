package projekat.lms.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import projekat.lms.dto.DrzavaDTO;
import projekat.lms.dto.MestoDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Drzava;
import projekat.lms.model.Mesto;

@Mapper(componentModel = "spring")
public interface DrzavaMapper  extends BaseMapper<Drzava, DrzavaDTO, Long>{
	Drzava toModel(DrzavaDTO dto);
	
	DrzavaDTO toDTO(Drzava model);
	
	@Mapping(target="drzava", ignore=true)
	MestoDTO toDTO(Mesto model);
}
