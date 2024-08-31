package projekat.lms.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.StudentDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.StudentMapper;
import projekat.lms.model.Student;
import projekat.lms.service.StudentService;

@Controller
@RequestMapping(path = "/api/security/studenti")
public class StudentController extends BaseController<Student, StudentDTO, Long> {
	@SuppressWarnings("unused")
	@Autowired
	private StudentService service;

	private StudentMapper mapper = Mappers.getMapper(StudentMapper.class);

	public StudentController(StudentService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
