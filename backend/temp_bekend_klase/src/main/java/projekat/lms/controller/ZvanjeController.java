package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.ZvanjeDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.ZvanjeMapper;
import projekat.lms.model.Zvanje;
import projekat.lms.service.ZvanjeService;


@Controller
@RequestMapping(path="/api/zvanja")
public class ZvanjeController extends BaseController<Zvanje, ZvanjeDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private ZvanjeService service;
	
	private ZvanjeMapper mapper = Mappers.getMapper(ZvanjeMapper.class);

	public ZvanjeController(ZvanjeService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
