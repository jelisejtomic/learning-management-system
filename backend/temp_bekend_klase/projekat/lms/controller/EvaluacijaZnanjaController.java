package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.EvaluacijaZnanjaDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.EvaluacijaZnanjaMapper;
import projekat.lms.model.EvaluacijaZnanja;
import projekat.lms.service.EvaluacijaZnanjaService;

@Controller
@RequestMapping(path="/api/evaluacijeZnanja")
public class EvaluacijaZnanjaController extends BaseController<EvaluacijaZnanja, EvaluacijaZnanjaDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private EvaluacijaZnanjaService service;
	
	private EvaluacijaZnanjaMapper mapper = Mappers.getMapper(EvaluacijaZnanjaMapper.class);

	public EvaluacijaZnanjaController(EvaluacijaZnanjaService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
