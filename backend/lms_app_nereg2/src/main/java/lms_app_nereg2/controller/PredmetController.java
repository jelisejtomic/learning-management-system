package lms_app_nereg2.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lms_app_nereg2.dto.PredmetDTO;
import lms_app_nereg2.generics.BaseController;
import lms_app_nereg2.mapper.PredmetMapper;
import lms_app_nereg2.model.Predmet;
import lms_app_nereg2.service.PredmetService;

@Controller
@SuppressWarnings("unused")
@RequestMapping(path = "/api/j/predmeti")
public class PredmetController extends BaseController<Predmet, PredmetDTO, Long> {
	@Autowired
	private PredmetService service;
	private PredmetMapper mapper = Mappers.getMapper(PredmetMapper.class);

	public PredmetController(PredmetService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}

}
