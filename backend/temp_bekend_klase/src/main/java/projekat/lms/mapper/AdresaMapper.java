package projekat.lms.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import projekat.lms.dto.AdresaDTO;
import projekat.lms.dto.DrzavaDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.Adresa;
import projekat.lms.model.Drzava;

@Mapper(componentModel = "spring")
public interface AdresaMapper  extends BaseMapper<Adresa, AdresaDTO, Long>{
	Adresa toModel(AdresaDTO dto);
	
	AdresaDTO toDTO(Adresa model);
	
	@Mapping(target = "mesta", ignore = true)
	DrzavaDTO toDTO(Drzava model);
}
