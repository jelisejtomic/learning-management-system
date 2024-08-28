package projekat.lms.dto;

import java.time.LocalDateTime;
import java.util.Set;

public class ObavestenjeDTO {
	private Long id;
	private LocalDateTime vremePostavljanja;
	private String sadrzaj;
	private String naslov;
	
	private Set<FajlDTO> fajlovi;
	
	public ObavestenjeDTO() {
		super();
	}
	
	public ObavestenjeDTO(Long id, LocalDateTime vremePostavljanja, String sadrzaj, String naslov,
			Set<FajlDTO> fajlovi) {
		super();
		this.id = id;
		this.vremePostavljanja = vremePostavljanja;
		this.sadrzaj = sadrzaj;
		this.naslov = naslov;
		this.fajlovi = fajlovi;
	}

	public Set<FajlDTO> getFajlovi() {
		return fajlovi;
	}
	public void setFajlovi(Set<FajlDTO> fajlovi) {
		this.fajlovi = fajlovi;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getVremePostavljanja() {
		return vremePostavljanja;
	}
	public void setVremePostavljanja(LocalDateTime vremePostavljanja) {
		this.vremePostavljanja = vremePostavljanja;
	}
	public String getSadrzaj() {
		return sadrzaj;
	}
	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	
	
}
