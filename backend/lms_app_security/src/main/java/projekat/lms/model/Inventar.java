package projekat.lms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import projekat.lms.generics.BaseEntity;

@Entity
public class Inventar extends BaseEntity {
	@Column(nullable = false, columnDefinition = "TEXT")
	private String naziv;

	@Column(nullable = false, columnDefinition = "TEXT")
	private String opis;

	@Column(columnDefinition = "Integer default 0")
	private Integer stanje;

	public Inventar(Long id, Boolean deleted, String naziv, String opis, Integer stanje) {
		super(id, deleted);
		this.naziv = naziv;
		this.opis = opis;
		this.stanje = stanje;
	}

	public Inventar() {
		super();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Integer getStanje() {
		return stanje;
	}

	public void setStanje(Integer stanje) {
		this.stanje = stanje;
	}

}