package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.OsobljeStudentskeSluzbeDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.OsobljeStudentskeSluzbeMapper;
import projekat.lms.model.OsobljeStudentskeSluzbe;
import projekat.lms.service.OsobljeStudentskeSluzbeService;

@Controller
@RequestMapping(path="/api/osobljeSluzbe")
public class OsobljeStudentskeSluzbeController extends BaseController<OsobljeStudentskeSluzbe, OsobljeStudentskeSluzbeDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private OsobljeStudentskeSluzbeService service;
	
	private OsobljeStudentskeSluzbeMapper mapper = Mappers.getMapper(OsobljeStudentskeSluzbeMapper.class);

	public OsobljeStudentskeSluzbeController(OsobljeStudentskeSluzbeService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
