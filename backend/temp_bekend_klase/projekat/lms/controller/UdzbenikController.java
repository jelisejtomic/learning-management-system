package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.UdzbenikDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.UdzbenikMapper;
import projekat.lms.model.Udzbenik;
import projekat.lms.service.UdzbenikService;

@Controller
@RequestMapping(path="/api/udzbenici")
public class UdzbenikController extends BaseController<Udzbenik, UdzbenikDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private UdzbenikService service;
	
	private UdzbenikMapper mapper = Mappers.getMapper(UdzbenikMapper.class);

	public UdzbenikController(UdzbenikService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
