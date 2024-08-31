package projekat.lms.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.TipEvaluacijeDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.TipEvaluacijeMapper;
import projekat.lms.model.TipEvaluacije;
import projekat.lms.service.TipEvaluacijeService;

@Controller
@RequestMapping(path = "/api/ispit/tipoviEvaluacije")
public class TipEvaluacijeController extends BaseController<TipEvaluacije, TipEvaluacijeDTO, Long> {
	@SuppressWarnings("unused")
	@Autowired
	private TipEvaluacijeService service;

	private TipEvaluacijeMapper mapper = Mappers.getMapper(TipEvaluacijeMapper.class);

	public TipEvaluacijeController(TipEvaluacijeService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
