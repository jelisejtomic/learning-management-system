package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.ZavrsniRadDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.ZavrsniRadMapper;
import projekat.lms.model.ZavrsniRad;
import projekat.lms.service.ZavrsniRadService;

@Controller
@RequestMapping(path="/api/zavrsniRadovi")
public class ZavrsniRadController extends BaseController<ZavrsniRad, ZavrsniRadDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private ZavrsniRadService service;
	
	private ZavrsniRadMapper mapper = Mappers.getMapper(ZavrsniRadMapper.class);

	public ZavrsniRadController(ZavrsniRadService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
