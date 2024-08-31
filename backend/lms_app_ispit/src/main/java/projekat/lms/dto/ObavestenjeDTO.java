package projekat.lms.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import projekat.lms.generics.BaseDTO;

public class ObavestenjeDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 4500455139246379424L;
	private LocalDateTime vremePostavljanja;
	private String sadrzaj;
	private String naslov;
	private Set<FajlDTO> fajlovi;

	public ObavestenjeDTO() {
		super();
	}

	public ObavestenjeDTO(Long id, Boolean deleted, LocalDateTime vremePostavljanja, String sadrzaj, String naslov,
			Set<FajlDTO> fajlovi) {
		super(id, deleted);
		this.vremePostavljanja = vremePostavljanja;
		this.sadrzaj = sadrzaj;
		this.naslov = naslov;
		this.fajlovi = fajlovi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
