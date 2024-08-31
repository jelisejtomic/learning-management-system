package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.MestoDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.MestoMapper;
import projekat.lms.model.Mesto;
import projekat.lms.service.MestoService;

@Controller
@RequestMapping(path="/api/univerzitet/mesta")
public class MestoController extends BaseController<Mesto, MestoDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private MestoService service;
	
	private MestoMapper mapper = Mappers.getMapper(MestoMapper.class);

	public MestoController(MestoService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
