package projekat.lms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projekat.lms.generics.BaseService;
import projekat.lms.model.Administrator;
import projekat.lms.repository.IAdministratorRepository;

@Service
public class AdministratorService extends BaseService<Administrator, Long> {
	@Autowired
	private IAdministratorRepository repository;

	public Optional<Administrator> findByUsername(String username) {
		return repository.findByUsername(username);
	}
}
