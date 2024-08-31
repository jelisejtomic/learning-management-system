package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.FajlDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.FajlMapper;
import projekat.lms.model.Fajl;
import projekat.lms.service.FajlService;

@Controller
@RequestMapping(path="/api/fakultet/fajlovi")
public class FajlController extends BaseController<Fajl, FajlDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private FajlService service;
	
	private FajlMapper mapper = Mappers.getMapper(FajlMapper.class);

	public FajlController(FajlService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
