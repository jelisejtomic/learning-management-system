package projekat.lms.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import projekat.lms.generics.BaseEntity;

@Entity
public class RegistrovaniKorisnik extends BaseEntity {
	@Column(nullable = false, unique = true)
	private String koriscnikoIme;

	@Column(nullable = false)
	private String lozinka;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false, columnDefinition = "TEXT")
	private String ime;

	@Column(nullable = false, columnDefinition = "TEXT")
	private String prezime;

	@ManyToMany
	private Set<Uloga> uloge;

	public RegistrovaniKorisnik() {
		super();
	}

	public RegistrovaniKorisnik(Long id, Boolean deleted, String koriscnikoIme, String lozinka, String email,
			String ime, String prezime, Set<Uloga> uloge) {
		super(id, deleted);
		this.koriscnikoIme = koriscnikoIme;
		this.lozinka = lozinka;
		this.email = email;
		this.ime = ime;
		this.prezime = prezime;
		this.uloge = uloge;
	}

	public Set<Uloga> getUloge() {
		return uloge;
	}

	public void setUloge(Set<Uloga> uloge) {
		this.uloge = uloge;
	}

	public String getKoriscnikoIme() {
		return koriscnikoIme;
	}

	public void setKoriscnikoIme(String koriscnikoIme) {
		this.koriscnikoIme = koriscnikoIme;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

}
