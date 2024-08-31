package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.StudijskiProgramDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.StudijskiProgramMapper;
import projekat.lms.model.StudijskiProgram;
import projekat.lms.service.StudijskiProgramService;

@Controller
@RequestMapping(path="/api/fakultet/studijskiProgrami")
public class StudijskiProgramController extends BaseController<StudijskiProgram, StudijskiProgramDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private StudijskiProgramService service;
	
	private StudijskiProgramMapper mapper = Mappers.getMapper(StudijskiProgramMapper.class);

	public StudijskiProgramController(StudijskiProgramService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
