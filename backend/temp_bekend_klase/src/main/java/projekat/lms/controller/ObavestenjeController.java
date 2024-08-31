package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.ObavestenjeDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.ObavestenjeMapper;
import projekat.lms.model.Obavestenje;
import projekat.lms.service.ObavestenjeService;

@Controller
@RequestMapping(path="/api/obavestenja")
public class ObavestenjeController extends BaseController<Obavestenje, ObavestenjeDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private ObavestenjeService service;
	
	private ObavestenjeMapper mapper = Mappers.getMapper(ObavestenjeMapper.class);

	public ObavestenjeController(ObavestenjeService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
