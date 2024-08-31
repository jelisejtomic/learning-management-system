package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.TipDokumentaDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.TipDokumentaMapper;
import projekat.lms.model.TipDokumenta;
import projekat.lms.service.TipDokumentaService;

@Controller
@RequestMapping(path="/api/univerzitet/tipoviDokumenta")
public class TipDokumentaController extends BaseController<TipDokumenta, TipDokumentaDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private TipDokumentaService service;
	
	private TipDokumentaMapper mapper = Mappers.getMapper(TipDokumentaMapper.class);

	public TipDokumentaController(TipDokumentaService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
