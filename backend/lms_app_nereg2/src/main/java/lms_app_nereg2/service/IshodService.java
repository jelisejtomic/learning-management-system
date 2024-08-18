package lms_app_nereg2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lms_app_nereg2.generics.BaseService;
import lms_app_nereg2.model.Ishod;
import lms_app_nereg2.repository.IshodRepository;

@Service
public class IshodService extends BaseService<Ishod, Long> {
	@SuppressWarnings("unused")
	@Autowired
	private IshodRepository repository;

}
