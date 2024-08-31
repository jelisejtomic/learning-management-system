package projekat.lms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class Mesto extends BaseEntity {

	@Column(nullable = false, columnDefinition = "TEXT")
	private String naziv;

	@ManyToOne(optional = false)
	private Drzava drzava;

	public Mesto(Long id, Boolean deleted, String naziv, Drzava drzava) {
		super(id, deleted);
		this.naziv = naziv;
		this.drzava = drzava;
	}

	public Mesto() {
		super();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Drzava getDrzava() {
		return drzava;
	}

	public void setDrzava(Drzava drzava) {
		this.drzava = drzava;
	}

}
