package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.TipZvanjaDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.TipZvanjaMapper;
import projekat.lms.model.TipZvanja;
import projekat.lms.service.TipZvanjaService;

@Controller
@RequestMapping(path="/api/tipoviZvanja")
public class TipZvanjaController extends BaseController<TipZvanja, TipZvanjaDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private TipZvanjaService service;
	
	private TipZvanjaMapper mapper = Mappers.getMapper(TipZvanjaMapper.class);

	public TipZvanjaController(TipZvanjaService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
