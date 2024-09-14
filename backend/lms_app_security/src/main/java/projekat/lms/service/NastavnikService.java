package projekat.lms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projekat.lms.generics.BaseService;
import projekat.lms.model.Nastavnik;
import projekat.lms.repository.INastavnikRepository;

@Service
public class NastavnikService extends BaseService<Nastavnik, Long> {
	@Autowired
	private INastavnikRepository repository;

	public Optional<Nastavnik> findByUsername(String username) {
		return repository.findByUsername(username);
	}
}
