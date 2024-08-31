package projekat.lms.controller;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.DokumentDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.DokumentMapper;
import projekat.lms.model.Dokument;
import projekat.lms.service.DokumentService;

@Controller
@RequestMapping(path="/api/univerzitet/dokumenti")
public class DokumentController extends BaseController<Dokument, DokumentDTO, Long>{
	@SuppressWarnings("unused")
	@Autowired
	private DokumentService service;
	
	private DokumentMapper mapper = Mappers.getMapper(DokumentMapper.class);

	public DokumentController(DokumentService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
