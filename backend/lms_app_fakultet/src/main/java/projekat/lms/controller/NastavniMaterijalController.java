package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.NastavniMaterijalDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.NastavniMaterijalMapper;
import projekat.lms.model.NastavniMaterijal;
import projekat.lms.service.NastavniMaterijalService;

@Controller
@RequestMapping(path="/api/fakultet/nastavniMaterijali")
public class NastavniMaterijalController extends BaseController<NastavniMaterijal, NastavniMaterijalDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private NastavniMaterijalService service;
	
	private NastavniMaterijalMapper mapper = Mappers.getMapper(NastavniMaterijalMapper.class);

	public NastavniMaterijalController(NastavniMaterijalService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}	
}
