package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.UniverzitetDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.UniverzitetMapper;
import projekat.lms.model.Univerzitet;
import projekat.lms.service.UniverzitetService;

@Controller
@RequestMapping(path="/api/univerziteti")
public class UniverzitetController extends BaseController<Univerzitet, UniverzitetDTO, Long>{
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
