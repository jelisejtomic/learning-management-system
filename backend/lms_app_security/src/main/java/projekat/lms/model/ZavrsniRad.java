package projekat.lms.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import projekat.lms.generics.BaseEntity;

@Entity
public class ZavrsniRad extends BaseEntity {
	@Column(nullable = false, columnDefinition = "TEXT")
	private String naziv;

	@OneToMany
	private Set<Fajl> fajlovi;

	@ManyToOne
	private Nastavnik mentor;

	public ZavrsniRad() {
		super();
	}

	public ZavrsniRad(Long id, Boolean deleted, String naziv, Set<Fajl> fajlovi, Nastavnik mentor) {
		super(id, deleted);
		this.naziv = naziv;
		this.fajlovi = fajlovi;
		this.mentor = mentor;
	}

	public Set<Fajl> getFajlovi() {
		return fajlovi;
	}

	public void setFajlovi(Set<Fajl> fajlovi) {
		this.fajlovi = fajlovi;
	}

	public Nastavnik getMentor() {
		return mentor;
	}

	public void setMentor(Nastavnik mentor) {
		this.mentor = mentor;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
}
