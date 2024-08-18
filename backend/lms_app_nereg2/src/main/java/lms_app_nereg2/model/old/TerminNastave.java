package lms_app_nereg2.model.old;

import java.time.LocalDateTime;

import lms_app_nereg2.model.Ishod;

public class TerminNastave {
	private Long id;
	private LocalDateTime pocetak; // 07-05-2023 10:00
	private LocalDateTime kraj; // 07-05-2023 12:00
	private String mestoOdrzavanja;

//	@OneToOne()
	private Ishod ishod;
	
//	@ManyToOne(optional = false)
//	private TipNastave tipNastave; //Predavanja, Vezbe, Mentorska nastava

//	@ManyToOne(optional = false)
//	private PredmetRealizacija realizacijaPredmeta;

}
