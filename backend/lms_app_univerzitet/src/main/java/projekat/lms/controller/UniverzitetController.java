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

import projekat.lms.dto.NastavnikDTO;
import projekat.lms.dto.UniverzitetDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.NastavnikMapper;
import projekat.lms.mapper.UniverzitetMapper;
import projekat.lms.model.Univerzitet;
import projekat.lms.service.UniverzitetService;

@Controller
@RequestMapping(path = "/api/univerzitet/univerziteti")
public class UniverzitetController extends BaseController<Univerzitet, UniverzitetDTO, Long> {
	@Autowired
	private UniverzitetService service;

	private UniverzitetMapper mapper = Mappers.getMapper(UniverzitetMapper.class);

	private NastavnikMapper nastavnikMapper = Mappers.getMapper(NastavnikMapper.class);

	public UniverzitetController(UniverzitetService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
	
	@GetMapping("/{univerzitetId}/nastavnici")
	public ResponseEntity<List<NastavnikDTO>> getAllNastavnici(@PathVariable Long univerzitetId) {
		return new ResponseEntity<>(nastavnikMapper.toDTO(service.getAllNastavnici(univerzitetId)), HttpStatus.OK);
	}
}
