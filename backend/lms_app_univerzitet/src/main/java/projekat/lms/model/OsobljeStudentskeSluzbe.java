package projekat.lms.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import projekat.lms.generics.BaseEntity;

@Entity
public class OsobljeStudentskeSluzbe extends BaseEntity {
	@ManyToOne
	private RegistrovaniKorisnik korisnik;

	@Column(nullable = false, columnDefinition = "TEXT")
	private String biografija;

	@OneToMany
	private Set<Inventar> inventar;

	@OneToMany
	private Set<Udzbenik> biblioteka;

	public OsobljeStudentskeSluzbe() {
		super();
	}

	public OsobljeStudentskeSluzbe(Long id, Boolean deleted, RegistrovaniKorisnik korisnik, String biografija,
			Set<Inventar> inventar, Set<Udzbenik> biblioteka) {
		super(id, deleted);
		this.korisnik = korisnik;
		this.biografija = biografija;
		this.inventar = inventar;
		this.biblioteka = biblioteka;
	}

	public RegistrovaniKorisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(RegistrovaniKorisnik korisnik) {
		this.korisnik = korisnik;
	}

	public String getBiografija() {
		return biografija;
	}

	public void setBiografija(String biografija) {
		this.biografija = biografija;
	}

	public Set<Inventar> getInventar() {
		return inventar;
	}

	public void setInventar(Set<Inventar> inventar) {
		this.inventar = inventar;
	}

	public Set<Udzbenik> getBiblioteka() {
		return biblioteka;
	}

	public void setBiblioteka(Set<Udzbenik> biblioteka) {
		this.biblioteka = biblioteka;
	}

}
