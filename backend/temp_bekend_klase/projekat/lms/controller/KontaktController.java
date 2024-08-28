package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.KontaktDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.KontaktMapper;
import projekat.lms.model.Kontakt;
import projekat.lms.service.KontaktService;

@Controller
@RequestMapping(path="/api/kontakti")
public class KontaktController extends BaseController<Kontakt, KontaktDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private KontaktService service;
	
	private KontaktMapper mapper = Mappers.getMapper(KontaktMapper.class);

	public KontaktController(KontaktService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
