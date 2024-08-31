package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.AdresaDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.AdresaMapper;
import projekat.lms.model.Adresa;
import projekat.lms.service.AdresaService;

@Controller
@RequestMapping(path="/api/adrese")
public class AdresaController extends BaseController<Adresa, AdresaDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private AdresaService service;
	
	private AdresaMapper mapper = Mappers.getMapper(AdresaMapper.class);

	public AdresaController(AdresaService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
