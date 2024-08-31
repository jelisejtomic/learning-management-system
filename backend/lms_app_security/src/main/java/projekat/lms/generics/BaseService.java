package projekat.lms.generics;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class BaseService<T, IdT> {
	@Autowired
	private CrudRepository<T, IdT> repository;

	public Iterable<T> findAll() {
		return repository.findAll();
	}

	public Optional<T> findOne(IdT id) {
		return repository.findById(id);
	}

	public T save(T entity) {
		return repository.save(entity);
	}

	public void delete(T entity) {
		repository.delete(entity);
	}

	public void deleteById(IdT id) {
		repository.deleteById(id);
	}
}
