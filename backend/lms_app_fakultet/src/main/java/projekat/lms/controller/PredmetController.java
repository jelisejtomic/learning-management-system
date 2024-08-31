package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.PredmetDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.PredmetMapper;
import projekat.lms.model.Predmet;
import projekat.lms.service.PredmetService;

@Controller
@RequestMapping(path="/api/fakultet/predmeti")
public class PredmetController extends BaseController<Predmet, PredmetDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private PredmetService service;
	
	private PredmetMapper mapper = Mappers.getMapper(PredmetMapper.class);

	public PredmetController(PredmetService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
