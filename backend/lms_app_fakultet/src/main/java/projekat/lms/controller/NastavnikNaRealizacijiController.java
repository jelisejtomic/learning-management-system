package projekat.lms.controller;

import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.NastavnikNaRealizacijiDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.NastavnikNaRealizacijiMapper;
import projekat.lms.model.NastavnikNaRealizaciji;
import projekat.lms.service.NastavnikNaRealizacijiService;

@Controller
@RequestMapping(path = "/api/fakultet/nastavniciNaRealizacijama")
public class NastavnikNaRealizacijiController
		extends BaseController<NastavnikNaRealizaciji, NastavnikNaRealizacijiDTO, Long> {
	@Autowired
	private NastavnikNaRealizacijiService service;

	private NastavnikNaRealizacijiMapper mapper = Mappers.getMapper(NastavnikNaRealizacijiMapper.class);

	public NastavnikNaRealizacijiController(NastavnikNaRealizacijiService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}

	@GetMapping("/nastavnik/{nastavnikId}/realizacije")
	public ResponseEntity<List<NastavnikNaRealizacijiDTO>> getAllByNastavnikId(@PathVariable Long nastavnikId) {
		return new ResponseEntity<>(
				mapper.toDTO((List<NastavnikNaRealizaciji>) service.findAllByNastavnikId(nastavnikId)), HttpStatus.OK);
	}
}
