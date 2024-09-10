package projekat.lms.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.StudentDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.StudentMapper;
import projekat.lms.model.Student;
import projekat.lms.service.StudentService;

@Controller
@RequestMapping(path = "/api/security/studenti")
public class StudentController extends BaseController<Student, StudentDTO, Long> {
	@Autowired
	private StudentService service;

	private StudentMapper mapper = Mappers.getMapper(StudentMapper.class);

	public StudentController(StudentService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}

	@GetMapping("/username/{username}")
	public ResponseEntity<StudentDTO> getStudentByUsername(@PathVariable String username) {
		return new ResponseEntity<StudentDTO>(mapper.toDTO(service.findByUsername(username).orElse(null)),
				HttpStatus.OK);

	}
}
