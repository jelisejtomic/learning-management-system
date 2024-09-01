package projekat.lms.model;


import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class Nastavnik extends BaseEntity {
	@ManyToOne
	private RegistrovaniKorisnik korisnik;

	@Column(columnDefinition = "VARCHAR(13)")
	private String jmbg;

	@Column(columnDefinition = "TEXT")
	private String biografija;

	@ManyToMany
	private Set<Zvanje> zvanja;

	public Nastavnik() {
		super();
	}

	public Nastavnik(Long id, Boolean deleted, RegistrovaniKorisnik korisnik, String jmbg, String biografija,
			Set<Zvanje> zvanja) {
		super(id, deleted);
		this.korisnik = korisnik;
		this.jmbg = jmbg;
		this.biografija = biografija;
		this.zvanja = zvanja;
	}

	public RegistrovaniKorisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(RegistrovaniKorisnik korisnik) {
		this.korisnik = korisnik;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getBiografija() {
		return biografija;
	}

	public void setBiografija(String biografija) {
		this.biografija = biografija;
	}

	public Set<Zvanje> getZvanja() {
		return zvanja;
	}

	public void setZvanja(Set<Zvanje> zvanja) {
		this.zvanja = zvanja;
	}

}