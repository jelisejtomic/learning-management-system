package lms_app_nereg2.generics;

import java.util.List;

public interface BaseMapper<T, DTO, IdT> {
	DTO toDTO(T model);

	T toModel(DTO dto);

	List<DTO> toDTO(List<T> model);

	List<T> toModel(List<DTO> dto);
}
