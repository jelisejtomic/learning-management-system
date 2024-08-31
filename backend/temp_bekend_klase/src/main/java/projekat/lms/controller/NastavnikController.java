package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.NastavnikDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.NastavnikMapper;
import projekat.lms.model.Nastavnik;
import projekat.lms.service.NastavnikService;

@Controller
@RequestMapping(path="/api/nastavnici")
public class NastavnikController extends BaseController<Nastavnik, NastavnikDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private NastavnikService service;
	
	private NastavnikMapper mapper = Mappers.getMapper(NastavnikMapper.class);

	public NastavnikController(NastavnikService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
