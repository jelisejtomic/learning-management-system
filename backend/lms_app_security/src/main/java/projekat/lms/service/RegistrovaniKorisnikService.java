package projekat.lms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projekat.lms.generics.BaseService;
import projekat.lms.model.RegistrovaniKorisnik;
import projekat.lms.repository.IRegistrovaniKorisnikRepository;

@Service
public class RegistrovaniKorisnikService extends BaseService<RegistrovaniKorisnik, Long> {
	@Autowired
	private IRegistrovaniKorisnikRepository repository;

	public Optional<RegistrovaniKorisnik> findByUsername(String username) {
		return repository.findByUsername(username);
	}
}
