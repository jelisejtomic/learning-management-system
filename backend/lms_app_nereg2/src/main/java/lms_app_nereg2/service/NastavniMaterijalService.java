package lms_app_nereg2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lms_app_nereg2.generics.BaseService;
import lms_app_nereg2.model.NastavniMaterijal;
import lms_app_nereg2.repository.NastavniMaterijalRepository;

@Service
public class NastavniMaterijalService extends BaseService<NastavniMaterijal, Long> {
	@SuppressWarnings("unused")
	@Autowired
	private NastavniMaterijalRepository repository;
}
