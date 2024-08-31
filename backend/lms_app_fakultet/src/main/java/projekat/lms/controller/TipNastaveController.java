package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.TipNastaveDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.TipNastaveMapper;
import projekat.lms.model.TipNastave;
import projekat.lms.service.TipNastaveService;

@Controller
@RequestMapping(path="/api/fakultet/tipoviNastave")
public class TipNastaveController extends BaseController<TipNastave, TipNastaveDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private TipNastaveService service;
	
	private TipNastaveMapper mapper = Mappers.getMapper(TipNastaveMapper.class);

	public TipNastaveController(TipNastaveService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
