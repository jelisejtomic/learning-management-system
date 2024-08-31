package projekat.lms.mapper;
import org.mapstruct.Mapper;

import projekat.lms.dto.IspitniRokDTO;
import projekat.lms.generics.BaseMapper;
import projekat.lms.model.IspitniRok;

@Mapper(componentModel = "spring")
public interface IspitniRokMapper extends BaseMapper<IspitniRok, IspitniRokDTO, Long>{
	IspitniRok toModel(IspitniRokDTO dto);
	
	IspitniRokDTO toDTO(IspitniRok model);
	
}
