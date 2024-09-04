package projekat.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projekat.lms.generics.BaseService;
import projekat.lms.model.Nastavnik;
import projekat.lms.model.Univerzitet;
import projekat.lms.repository.IUniverzitetRepository;

@Service
public class UniverzitetService extends BaseService<Univerzitet, Long> {
	@Autowired
	private IUniverzitetRepository repository;

	public List<Nastavnik> getAllNastavnici(Long univerzitetId) {
		return repository.findAllNastavniciByUniverzitetId(univerzitetId);
	}
}
