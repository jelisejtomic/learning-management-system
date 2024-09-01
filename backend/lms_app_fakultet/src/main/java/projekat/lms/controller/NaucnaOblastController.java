package projekat.lms.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.NaucnaOblastDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.NaucnaOblastMapper;
import projekat.lms.model.NaucnaOblast;
import projekat.lms.service.NaucnaOblastService;

@Controller
@RequestMapping(path = "/api/fakultet/naucneOblasti")
public class NaucnaOblastController extends BaseController<NaucnaOblast, NaucnaOblastDTO, Long> {
	@SuppressWarnings("unused")
	@Autowired
	private NaucnaOblastService service;

	private NaucnaOblastMapper mapper = Mappers.getMapper(NaucnaOblastMapper.class);

	public NaucnaOblastController(NaucnaOblastService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
