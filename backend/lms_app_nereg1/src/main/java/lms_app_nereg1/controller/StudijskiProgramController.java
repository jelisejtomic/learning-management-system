package lms_app_nereg1.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lms_app_nereg1.dto.StudijskiProgramDTO;
import lms_app_nereg1.generics.GenController;
import lms_app_nereg1.mapper.StudijskiProgramMapper;
import lms_app_nereg1.model.StudijskiProgram;
import lms_app_nereg1.service.StudijskiProgramService;

@Controller
@RequestMapping(path = "/api/n/studijskiProgrami")
public class StudijskiProgramController extends GenController<StudijskiProgram, StudijskiProgramDTO, Long>{
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
