package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.TipKontaktaDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.TipKontaktaMapper;
import projekat.lms.model.TipKontakta;
import projekat.lms.service.TipKontaktaService;

@Controller
@RequestMapping(path="/api/univerzitet/tipoviKontakata")
public class TipKontaktaController extends BaseController<TipKontakta, TipKontaktaDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private TipKontaktaService service;
	
	private TipKontaktaMapper mapper = Mappers.getMapper(TipKontaktaMapper.class);

	public TipKontaktaController(TipKontaktaService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
