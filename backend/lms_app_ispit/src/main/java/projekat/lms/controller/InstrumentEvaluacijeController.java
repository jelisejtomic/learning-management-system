package projekat.lms.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.InstrumentEvaluacijeDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.InstrumentEvaluacijeMapper;
import projekat.lms.model.InstrumentEvaluacije;
import projekat.lms.service.InstrumentEvaluacijeService;

@Controller
@RequestMapping(path = "/api/ispit/instrumentiEvaluacije")
public class InstrumentEvaluacijeController
		extends BaseController<InstrumentEvaluacije, InstrumentEvaluacijeDTO, Long> {
	@SuppressWarnings("unused")
	@Autowired
	private InstrumentEvaluacijeService service;

	private InstrumentEvaluacijeMapper mapper = Mappers.getMapper(InstrumentEvaluacijeMapper.class);

	public InstrumentEvaluacijeController(InstrumentEvaluacijeService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
