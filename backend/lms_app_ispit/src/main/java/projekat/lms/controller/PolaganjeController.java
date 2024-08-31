package projekat.lms.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.PolaganjeDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.PolaganjeMapper;
import projekat.lms.model.Polaganje;
import projekat.lms.service.PolaganjeService;

@Controller
@RequestMapping(path = "/api/ispit/polaganja")
public class PolaganjeController extends BaseController<Polaganje, PolaganjeDTO, Long> {
	@SuppressWarnings("unused")
	@Autowired
	private PolaganjeService service;

	private PolaganjeMapper mapper = Mappers.getMapper(PolaganjeMapper.class);

	public PolaganjeController(PolaganjeService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
