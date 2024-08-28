package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.InventarDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.InventarMapper;
import projekat.lms.model.Inventar;
import projekat.lms.service.InventarService;

@Controller
@RequestMapping(path="/api/inventar")
public class InventarController extends BaseController<Inventar, InventarDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private InventarService service;
	
	private InventarMapper mapper = Mappers.getMapper(InventarMapper.class);

	public InventarController(InventarService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
