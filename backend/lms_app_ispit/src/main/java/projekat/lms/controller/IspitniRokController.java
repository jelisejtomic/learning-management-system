package projekat.lms.controller;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import projekat.lms.dto.IspitniRokDTO;
import projekat.lms.generics.BaseController;
import projekat.lms.mapper.IspitniRokMapper;
import projekat.lms.model.IspitniRok;
import projekat.lms.service.IspitniRokService;

@Controller
@RequestMapping(path = "/api/ispit/ispitniRokovi")
public class IspitniRokController extends BaseController<IspitniRok, IspitniRokDTO, Long> {
	@SuppressWarnings("unused")
	@Autowired
	private IspitniRokService service;

	private IspitniRokMapper mapper = Mappers.getMapper(IspitniRokMapper.class);

	public IspitniRokController(IspitniRokService service) {
		super();
		this.service = service;
		super.setMapper(this.mapper);
	}
}
