package lms_app_nereg1.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lms_app_nereg1.dto.UniverzitetDTO;
import lms_app_nereg1.generics.GenController;
import lms_app_nereg1.mapper.UniverzitetMapper;
import lms_app_nereg1.model.Univerzitet;
import lms_app_nereg1.service.UniverzitetService;

@Controller
@RequestMapping(path="/api/n/univerziteti")
public class UniverzitetController extends GenController<Univerzitet, UniverzitetDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private UniverzitetService service;
	
	private UniverzitetMapper mapper = Mappers.getMapper(UniverzitetMapper.class);

	public UniverzitetController(UniverzitetService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
	
	
}
