package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.FakultetDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.FakultetMapper;
import projekat.lms.model.Fakultet;
import projekat.lms.service.FakultetService;

@Controller
@RequestMapping(path="/api/fakulteti")
public class FakultetController extends BaseController<Fakultet, FakultetDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private FakultetService service;
	
	private FakultetMapper mapper = Mappers.getMapper(FakultetMapper.class);

	public FakultetController(FakultetService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
