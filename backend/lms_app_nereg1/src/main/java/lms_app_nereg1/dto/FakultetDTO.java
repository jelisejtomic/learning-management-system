package lms_app_nereg1.dto;

import java.util.Set;


public class FakultetDTO{
	private Long id;
	
	private Set<StudijskiProgramDTO> studijskiProgrami;
	
	private String naziv;
	
	// dekan Nastavnikdto
	private String dekan;
	
	// adresa Adresadto
	private String adresa;
	
	// kontakti Kontakt [] dto
	private Set<String> kontakti;
	
	// univerzitet Univerzitet dto
	private UniverzitetDTO univerzitet;
	
	public FakultetDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public FakultetDTO(Long id, Set<StudijskiProgramDTO> studijskiProgrami, String naziv, String dekan, String adresa,
			Set<String> kontakti, UniverzitetDTO univerzitet) {
		super();
		this.id = id;
		this.studijskiProgrami = studijskiProgrami;
		this.naziv = naziv;
		this.dekan = dekan;
		this.adresa = adresa;
		this.kontakti = kontakti;
		this.univerzitet = univerzitet;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getDekan() {
		return dekan;
	}

	public void setDekan(String dekan) {
		this.dekan = dekan;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public Set<String> getKontakti() {
		return kontakti;
	}

	public void setKontakti(Set<String> kontakti) {
		this.kontakti = kontakti;
	}

	public UniverzitetDTO getUniverzitet() {
		return univerzitet;
	}

	public void setUniverzitet(UniverzitetDTO univerzitet) {
		this.univerzitet = univerzitet;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<StudijskiProgramDTO> getStudijskiProgrami() {
		return studijskiProgrami;
	}

	public void setStudijskiProgrami(Set<StudijskiProgramDTO> studijskiProgrami) {
		this.studijskiProgrami = studijskiProgrami;
	}
	
	
}
