package projekat.lms.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import projekat.lms.generics.BaseEntity;

@Entity
public class NastavniMaterijal extends BaseEntity {
	@Column(nullable = false, columnDefinition = "VARCHAR(128)")
	private String naziv;

	@Column(nullable = false)
	private Integer godinaIzdavanja; // mozda YEAR

	@Column(nullable = true, columnDefinition = "VARCHAR(256)")
	private Set<String> autori; // private Set<NastavniMaterijalAutor> autori;

	@OneToMany
	private Set<Fajl> fajlovi;

	public NastavniMaterijal() {
		super();
	}

	public NastavniMaterijal(Long id, Boolean deleted, String naziv, Integer godinaIzdavanja, Set<String> autori,
			Set<Fajl> fajlovi) {
		super(id, deleted);
		this.naziv = naziv;
		this.godinaIzdavanja = godinaIzdavanja;
		this.autori = autori;
		this.fajlovi = fajlovi;
	}

	public Set<Fajl> getFajlovi() {
		return fajlovi;
	}

	public void setFajlovi(Set<Fajl> fajlovi) {
		this.fajlovi = fajlovi;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Integer getGodinaIzdavanja() {
		return godinaIzdavanja;
	}

	public void setGodinaIzdavanja(Integer godinaIzdavanja) {
		this.godinaIzdavanja = godinaIzdavanja;
	}

	public Set<String> getAutori() {
		return autori;
	}

	public void setAutori(Set<String> autori) {
		this.autori = autori;
	}
}
