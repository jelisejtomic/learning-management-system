package lms_app_nereg2.model.old;

import java.time.LocalDateTime;

public class Obavestenje {
	//Nastavnici upravljaju obaveštenjima za predmete na kojima su angažovani.
	private Long id;
	private String naslov;
	private String sadrzaj;
	private LocalDateTime vremePostavljanja;
	
//	@Column(nullable = false)
//	private NastavnikNaRealizaciji nastavnik;
	
//	@ManyToOne(optional = false)
	private PredmetRealizacija predmet;
	
//	@OneToMany(mappedBy = "obavestenje")
//	private Set<Fajl> prilozi = new HashSet<>();

}
