package projekat.lms.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.StudentNaGodiniDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.StudentNaGodiniMapper;
import projekat.lms.model.StudentNaGodini;
import projekat.lms.service.StudentNaGodiniService;

@Controller
@RequestMapping(path = "/api/fakultet/studentiNaGodinama")
public class StudentNaGodiniController extends BaseController<StudentNaGodini, StudentNaGodiniDTO, Long> {
	@SuppressWarnings("unused")
	@Autowired
	private StudentNaGodiniService service;

	private StudentNaGodiniMapper mapper = Mappers.getMapper(StudentNaGodiniMapper.class);

	public StudentNaGodiniController(StudentNaGodiniService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
