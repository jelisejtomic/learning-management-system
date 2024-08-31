package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.PohadjanjePredmetaDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.PohadjanjePredmetaMapper;
import projekat.lms.model.PohadjanjePredmeta;
import projekat.lms.service.PohadjanjePredmetaService;

@Controller
@RequestMapping(path="/api/pohadjanjaPredmeta")
public class PohadjanjePredmetaController extends BaseController<PohadjanjePredmeta, PohadjanjePredmetaDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private PohadjanjePredmetaService service;
	
	private PohadjanjePredmetaMapper mapper = Mappers.getMapper(PohadjanjePredmetaMapper.class);

	public PohadjanjePredmetaController(PohadjanjePredmetaService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
