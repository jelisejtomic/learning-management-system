package projekat.lms.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.RegistrovaniKorisnikDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.RegistrovaniKorisnikMapper;
import projekat.lms.model.RegistrovaniKorisnik;
import projekat.lms.service.RegistrovaniKorisnikService;

@Controller
@RequestMapping(path = "/api/security/registrovaniKorisnici")
public class RegistrovaniKorisnikController
		extends BaseController<RegistrovaniKorisnik, RegistrovaniKorisnikDTO, Long> {
	@Autowired
	private RegistrovaniKorisnikService service;

	private RegistrovaniKorisnikMapper mapper = Mappers.getMapper(RegistrovaniKorisnikMapper.class);

	public RegistrovaniKorisnikController(RegistrovaniKorisnikService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}

	@GetMapping("/username/{username}")
	public ResponseEntity<RegistrovaniKorisnikDTO> getRegistrovaniKorisnikByUsername(@PathVariable String username) {
		return new ResponseEntity<RegistrovaniKorisnikDTO>(mapper.toDTO(service.findByUsername(username).orElse(null)),
				HttpStatus.OK);
	}
}
