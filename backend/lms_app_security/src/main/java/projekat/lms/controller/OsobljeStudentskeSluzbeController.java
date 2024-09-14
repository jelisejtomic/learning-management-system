package projekat.lms.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.OsobljeStudentskeSluzbeDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.OsobljeStudentskeSluzbeMapper;
import projekat.lms.model.OsobljeStudentskeSluzbe;
import projekat.lms.service.OsobljeStudentskeSluzbeService;

@Controller
@RequestMapping(path = "/api/security/osobljeSluzbe")
public class OsobljeStudentskeSluzbeController
		extends BaseController<OsobljeStudentskeSluzbe, OsobljeStudentskeSluzbeDTO, Long> {
	@Autowired
	private OsobljeStudentskeSluzbeService service;

	private OsobljeStudentskeSluzbeMapper mapper = Mappers.getMapper(OsobljeStudentskeSluzbeMapper.class);

	public OsobljeStudentskeSluzbeController(OsobljeStudentskeSluzbeService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}

	@GetMapping("/username/{username}")
	public ResponseEntity<OsobljeStudentskeSluzbeDTO> getOsobljeStudentskeSluzbeByUsername(
			@PathVariable String username) {
		return new ResponseEntity<OsobljeStudentskeSluzbeDTO>(
				mapper.toDTO(service.findByUsername(username).orElse(null)), HttpStatus.OK);
	}
}
