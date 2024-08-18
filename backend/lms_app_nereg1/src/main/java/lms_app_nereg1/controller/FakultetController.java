package lms_app_nereg1.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lms_app_nereg1.dto.FakultetDTO;
import lms_app_nereg1.generics.GenController;
import lms_app_nereg1.mapper.FakultetMapper;
import lms_app_nereg1.model.Fakultet;
import lms_app_nereg1.service.FakultetService;

@Controller
@RequestMapping(path="/api/n/fakulteti")
public class FakultetController extends GenController<Fakultet, FakultetDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private FakultetService service;
	
	private FakultetMapper mapper = Mappers.getMapper(FakultetMapper.class);

	public FakultetController(FakultetService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
	
	
}
