package projekat.lms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class Administrator extends BaseEntity {
	@ManyToOne
	private RegistrovaniKorisnik korisnik;

	public Administrator() {
		super();
	}

	public Administrator(Long id, Boolean deleted, RegistrovaniKorisnik korisnik) {
		super(id, deleted);
		this.korisnik = korisnik;
	}

	public RegistrovaniKorisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(RegistrovaniKorisnik korisnik) {
		this.korisnik = korisnik;
	}

}