package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.IshodDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.IshodMapper;
import projekat.lms.model.Ishod;
import projekat.lms.service.IshodService;

@Controller
@RequestMapping(path="/api/fakultet/ishodi")
public class IshodController extends BaseController<Ishod, IshodDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private IshodService service;
	
	private IshodMapper mapper = Mappers.getMapper(IshodMapper.class);

	public IshodController(IshodService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
