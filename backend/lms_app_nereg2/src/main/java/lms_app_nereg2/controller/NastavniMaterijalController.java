package lms_app_nereg2.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lms_app_nereg2.dto.NastavniMaterijalDTO;
import lms_app_nereg2.generics.BaseController;
import lms_app_nereg2.mapper.NastavniMaterijalMapper;
import lms_app_nereg2.model.NastavniMaterijal;
import lms_app_nereg2.service.NastavniMaterijalService;

@Controller
@SuppressWarnings("unused")
@RequestMapping(path = "/api/j/nastavniMaterijali")
public class NastavniMaterijalController extends BaseController<NastavniMaterijal, NastavniMaterijalDTO, Long> {
	@Autowired
	private NastavniMaterijalService service;
	private NastavniMaterijalMapper mapper = Mappers.getMapper(NastavniMaterijalMapper.class);

	public NastavniMaterijalController(NastavniMaterijalService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}

}
