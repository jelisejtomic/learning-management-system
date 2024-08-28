package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.TerminNastaveDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.TerminNastaveMapper;
import projekat.lms.model.TerminNastave;
import projekat.lms.service.TerminNastaveService;

@Controller
@RequestMapping(path="/api/terminiNastave")
public class TerminNastaveController extends BaseController<TerminNastave, TerminNastaveDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private TerminNastaveService service;
	
	private TerminNastaveMapper mapper = Mappers.getMapper(TerminNastaveMapper.class);

	public TerminNastaveController(TerminNastaveService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
