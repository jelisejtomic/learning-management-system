package lms_app_nereg2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lms_app_nereg2.generics.BaseEntity;

@Entity
public class NastavniMaterijal extends BaseEntity {

	@Column(nullable = false, columnDefinition = "VARCHAR(128)")
	private String naziv;

	@Column(nullable = false)
	private Integer godinaIzdavanja; // mozda YEAR

	@ManyToOne(optional = false)
	private Ishod ishod;

	@Column(nullable = false)
//	private Set<String> autori;
	private String autori;

//	@OneToMany(mappedBy = "nastavniMaterijal")
//	private Set<File> fajlovi;

	public NastavniMaterijal() {
		super();
	}

	public NastavniMaterijal(String naziv, Integer godinaIzdavanja, Ishod ishod, String autori) {
		super();
		this.naziv = naziv;
		this.godinaIzdavanja = godinaIzdavanja;
		this.ishod = ishod;
		this.autori = autori;
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

	public Ishod getIshod() {
		return ishod;
	}

	public void setIshod(Ishod ishod) {
		this.ishod = ishod;
	}

	public String getAutori() {
		return autori;
	}

	public void setAutori(String autori) {
		this.autori = autori;
	}

}
