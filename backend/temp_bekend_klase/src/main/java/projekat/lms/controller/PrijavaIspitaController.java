package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.PrijavaIspitaDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.PrijavaIspitaMapper;
import projekat.lms.model.PrijavaIspita;
import projekat.lms.service.PrijavaIspitaService;

@Controller
@RequestMapping(path="/api/prijaveIspita")
public class PrijavaIspitaController extends BaseController<PrijavaIspita, PrijavaIspitaDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private PrijavaIspitaService service;
	
	private PrijavaIspitaMapper mapper = Mappers.getMapper(PrijavaIspitaMapper.class);

	public PrijavaIspitaController(PrijavaIspitaService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
