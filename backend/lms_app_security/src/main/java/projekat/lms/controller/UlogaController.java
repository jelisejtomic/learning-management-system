package projekat.lms.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.UlogaDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.UlogaMapper;
import projekat.lms.model.Uloga;
import projekat.lms.service.UlogaService;

@Controller
@RequestMapping(path = "/api/security/uloge")
public class UlogaController extends BaseController<Uloga, UlogaDTO, Long> {
	@SuppressWarnings("unused")
	@Autowired
	private UlogaService service;

	private UlogaMapper mapper = Mappers.getMapper(UlogaMapper.class);

	public UlogaController(UlogaService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
