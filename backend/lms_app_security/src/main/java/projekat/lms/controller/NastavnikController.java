package projekat.lms.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.NastavnikDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.NastavnikMapper;
import projekat.lms.model.Nastavnik;
import projekat.lms.service.NastavnikService;

@Controller
@RequestMapping(path = "/api/security/nastavnici")
public class NastavnikController extends BaseController<Nastavnik, NastavnikDTO, Long> {
	@Autowired
	private NastavnikService service;

	private NastavnikMapper mapper = Mappers.getMapper(NastavnikMapper.class);

	public NastavnikController(NastavnikService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}

	@GetMapping("/username/{username}")
	public ResponseEntity<NastavnikDTO> getNastavnikByUsername(@PathVariable String username) {
		return new ResponseEntity<NastavnikDTO>(mapper.toDTO(service.findByUsername(username).orElse(null)),
				HttpStatus.OK);
	}
}
