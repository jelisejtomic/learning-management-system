package lms_app_nereg2.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lms_app_nereg2.dto.IshodDTO;
import lms_app_nereg2.generics.BaseController;
import lms_app_nereg2.mapper.IshodMapper;
import lms_app_nereg2.model.Ishod;
import lms_app_nereg2.service.IshodService;

@Controller
@SuppressWarnings("unused")
@RequestMapping(path = "/api/j/ishodi")
public class IshodController extends BaseController<Ishod, IshodDTO, Long> {
	@Autowired
	private IshodService service;
	private IshodMapper mapper = Mappers.getMapper(IshodMapper.class);

	public IshodController(IshodService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}

}
