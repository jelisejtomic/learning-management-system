package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.DrzavaDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.DrzavaMapper;
import projekat.lms.model.Drzava;
import projekat.lms.service.DrzavaService;

@Controller
@RequestMapping(path="/api/drzave")
public class DrzavaController extends BaseController<Drzava, DrzavaDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private DrzavaService service;
	
	private DrzavaMapper mapper = Mappers.getMapper(DrzavaMapper.class);

	public DrzavaController(DrzavaService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
