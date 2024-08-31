package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.ObrazovniCiljDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.ObrazovniCiljMapper;
import projekat.lms.model.ObrazovniCilj;
import projekat.lms.service.ObrazovniCiljService;

@Controller
@RequestMapping(path="/api/fakultet/obrazovniCiljevi")
public class ObrazovniCiljController extends BaseController<ObrazovniCilj, ObrazovniCiljDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private ObrazovniCiljService service;
	
	private ObrazovniCiljMapper mapper = Mappers.getMapper(ObrazovniCiljMapper.class);

	public ObrazovniCiljController(ObrazovniCiljService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
