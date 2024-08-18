package lms_app_nereg2.generics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public abstract class BaseController<T, DTO, IdT> {
	@Autowired
	private BaseService<T, IdT> service;

	private BaseMapper<T, DTO, IdT> mapper;

	public void setMapper(BaseMapper<T, DTO, IdT> mapper) {
		this.mapper = mapper;
	}

	@GetMapping
	public ResponseEntity<List<DTO>> getAll() {
		return new ResponseEntity<>(mapper.toDTO((List<T>) service.findAll()), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<DTO> get(@PathVariable IdT id) throws NotFoundException {
		return new ResponseEntity<DTO>(mapper.toDTO(service.findOne(id).orElse(null)), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<DTO> create(@Validated @RequestBody DTO DTO) throws NotFoundException {
		// DTO.setId(null);
		return new ResponseEntity<DTO>(mapper.toDTO(service.save(mapper.toModel(DTO))), HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<DTO> update(@PathVariable IdT id, @Validated @RequestBody DTO DTO) throws NotFoundException {
		// DTO.setId(id);
		return new ResponseEntity<DTO>(mapper.toDTO(service.save(mapper.toModel(DTO))), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<DTO> deleteById(@PathVariable IdT id) throws NotFoundException {
		DTO objectDTO = mapper.toDTO(service.findOne(id).orElse(null));
		service.deleteById(id);
		return new ResponseEntity<DTO>(objectDTO, HttpStatus.GONE);
	}

}
