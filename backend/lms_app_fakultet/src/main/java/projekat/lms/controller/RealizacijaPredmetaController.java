package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.RealizacijaPredmetaDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.RealizacijaPredmetaMapper;
import projekat.lms.model.RealizacijaPredmeta;
import projekat.lms.service.RealizacijaPredmetaService;

@Controller
@RequestMapping(path="/api/fakultet/realizacijePredmeta")
public class RealizacijaPredmetaController extends BaseController<RealizacijaPredmeta, RealizacijaPredmetaDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private RealizacijaPredmetaService service;
	
	private RealizacijaPredmetaMapper mapper = Mappers.getMapper(RealizacijaPredmetaMapper.class);

	public RealizacijaPredmetaController(RealizacijaPredmetaService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
