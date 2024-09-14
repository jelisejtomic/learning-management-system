package projekat.lms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projekat.lms.generics.BaseService;
import projekat.lms.model.OsobljeStudentskeSluzbe;
import projekat.lms.repository.IOsobljeStudentskeSluzbeRepository;

@Service
public class OsobljeStudentskeSluzbeService extends BaseService<OsobljeStudentskeSluzbe, Long> {
	@Autowired
	private IOsobljeStudentskeSluzbeRepository repository;

	public Optional<OsobljeStudentskeSluzbe> findByUsername(String username) {
		return repository.findByUsername(username);
	}
}
