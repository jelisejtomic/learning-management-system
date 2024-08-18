package lms_app_nereg1.generics;

import java.util.List;


public interface GenMapper<T, DTO, IdT> {
    DTO toDTO(T model);

    T toModel(DTO DTO);

    List<DTO> toDTO(List<T> model);

    List<T> toModel(List<DTO> DTO);
}