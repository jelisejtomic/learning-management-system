package projekat.lms.model;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import projekat.lms.generics.BaseEntity;

@Entity
public class Obavestenje extends BaseEntity {
	@Column(nullable = false, columnDefinition = "DATETIME")
	private LocalDateTime vremePostavljanja;

	@Column(nullable = false, columnDefinition = "TEXT")
	private String sadrzaj;

	@Column(nullable = false, columnDefinition = "TEXT")
	private String naslov;

	@OneToMany
	private Set<Fajl> fajlovi;

	public Obavestenje() {
		super();
	}

	public Obavestenje(Long id, Boolean deleted, LocalDateTime vremePostavljanja, String sadrzaj, String naslov,
			Set<Fajl> fajlovi) {
		super(id, deleted);
		this.vremePostavljanja = vremePostavljanja;
		this.sadrzaj = sadrzaj;
		this.naslov = naslov;
		this.fajlovi = fajlovi;
	}

	public Set<Fajl> getFajlovi() {
		return fajlovi;
	}

	public void setFajlovi(Set<Fajl> fajlovi) {
		this.fajlovi = fajlovi;
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