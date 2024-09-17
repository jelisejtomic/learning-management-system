package projekat.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projekat.lms.generics.BaseService;
import projekat.lms.model.NastavnikNaRealizaciji;
import projekat.lms.repository.INastavnikNaRealizacijiRepository;

@Service
public class NastavnikNaRealizacijiService extends BaseService<NastavnikNaRealizaciji, Long> {
	@Autowired
	INastavnikNaRealizacijiRepository repository;

	public Iterable<NastavnikNaRealizaciji> findAllByNastavnikId(Long nastavnikId) {
		return repository.findAllByNastavnikId(nastavnikId);
	}
}
