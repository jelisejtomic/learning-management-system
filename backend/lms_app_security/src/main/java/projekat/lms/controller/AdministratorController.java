package projekat.lms.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.AdministratorDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.AdministratorMapper;
import projekat.lms.model.Administrator;
import projekat.lms.service.AdministratorService;

@Controller
@RequestMapping(path = "/api/security/administratori")
public class AdministratorController extends BaseController<Administrator, AdministratorDTO, Long> {
	@SuppressWarnings("unused")
	@Autowired
	private AdministratorService service;

	private AdministratorMapper mapper = Mappers.getMapper(AdministratorMapper.class);

	public AdministratorController(AdministratorService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
