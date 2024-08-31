package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.GodinaStudijaDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.GodinaStudijaMapper;
import projekat.lms.model.GodinaStudija;
import projekat.lms.service.GodinaStudijaService;

@Controller
@RequestMapping(path="/api/godineStudija")
public class GodinaStudijaController extends BaseController<GodinaStudija, GodinaStudijaDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private GodinaStudijaService service;
	
	private GodinaStudijaMapper mapper = Mappers.getMapper(GodinaStudijaMapper.class);

	public GodinaStudijaController(GodinaStudijaService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
