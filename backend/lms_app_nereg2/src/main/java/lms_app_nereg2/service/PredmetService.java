package lms_app_nereg2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lms_app_nereg2.generics.BaseService;
import lms_app_nereg2.model.Predmet;
import lms_app_nereg2.repository.PredmetRepository;

@Service
public class PredmetService extends BaseService<Predmet, Long> {
	@Autowired
	PredmetRepository repository;
}
