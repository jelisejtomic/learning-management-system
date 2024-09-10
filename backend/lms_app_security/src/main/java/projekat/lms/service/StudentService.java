package projekat.lms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projekat.lms.generics.BaseService;
import projekat.lms.model.Student;
import projekat.lms.repository.IStudentRepository;

@Service
public class StudentService extends BaseService<Student, Long> {
	@Autowired
	private IStudentRepository repository;

	public Optional<Student> findByUsername (String username){
		return repository.findByUsername(username);
	}
}
