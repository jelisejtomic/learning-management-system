package projekat.lms.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.OdbranaZavrsnogRadaDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.OdbranaZavrsnogRadaMapper;
import projekat.lms.model.OdbranaZavrsnogRada;
import projekat.lms.service.OdbranaZavrsnogRadaService;

@Controller
@RequestMapping(path = "/api/ispit/odbraneZavrsnihRadova")
public class OdbranaZavrsnogRadaController extends BaseController<OdbranaZavrsnogRada, OdbranaZavrsnogRadaDTO, Long> {
	@SuppressWarnings("unused")
	@Autowired
	private OdbranaZavrsnogRadaService service;

	private OdbranaZavrsnogRadaMapper mapper = Mappers.getMapper(OdbranaZavrsnogRadaMapper.class);

	public OdbranaZavrsnogRadaController(OdbranaZavrsnogRadaService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
