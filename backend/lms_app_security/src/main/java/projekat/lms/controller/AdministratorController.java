package projekat.lms.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.AdministratorDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.AdministratorMapper;
import projekat.lms.model.Administrator;
import projekat.lms.service.AdministratorService;

@Controller
@RequestMapping(path = "/api/security/administratori")
public class AdministratorController extends BaseController<Administrator, AdministratorDTO, Long> {
	@Autowired
	private AdministratorService service;

	private AdministratorMapper mapper = Mappers.getMapper(AdministratorMapper.class);

	public AdministratorController(AdministratorService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}

	@GetMapping("/username/{username}")
	public ResponseEntity<AdministratorDTO> getAdministratorByUsername(@PathVariable String username) {
		return new ResponseEntity<AdministratorDTO>(mapper.toDTO(service.findByUsername(username).orElse(null)),
				HttpStatus.OK);

	}
}
