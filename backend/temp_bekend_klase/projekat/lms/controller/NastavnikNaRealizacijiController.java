package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.NastavnikNaRealizacijiDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.NastavnikNaRealizacijiMapper;
import projekat.lms.model.NastavnikNaRealizaciji;
import projekat.lms.service.NastavnikNaRealizacijiService;

@Controller
@RequestMapping(path="/api/nastavniciNaRealizacijama")
public class NastavnikNaRealizacijiController extends BaseController<NastavnikNaRealizaciji, NastavnikNaRealizacijiDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private NastavnikNaRealizacijiService service;
	
	private NastavnikNaRealizacijiMapper mapper = Mappers.getMapper(NastavnikNaRealizacijiMapper.class);

	public NastavnikNaRealizacijiController(NastavnikNaRealizacijiService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
