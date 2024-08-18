package lms_app_nereg2.model.old;

import lms_app_nereg2.model.Predmet;

public class PredmetRealizacija {
	private Long id;
	private Integer godinaIzvodjenja;
	
//	@ManyToOne(optional = false)
	private Predmet predmet;
	
// 	@OneToMany(mappedBy = "realizacijaPredmeta")
//	private Set<TerminNastave> terminiNastave = new HashSet<>();
	
//	@OneToMany(mappedBy = "realizacijaPredmeta")
//	private Set<PredmetPohadjanje> pohadjanjaPredmeta = new HashSet<>(); //spisak pohadjanja na godini

}
