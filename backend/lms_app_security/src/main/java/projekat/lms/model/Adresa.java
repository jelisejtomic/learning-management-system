package projekat.lms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class Adresa extends BaseEntity {
	@Column
	private String ulica;

	@Column
	private String broj;

	@ManyToOne
	private Mesto mesto;

	public Adresa(Long id, Boolean deleted, String ulica, String broj, Mesto mesto) {
		super(id, deleted);
		this.ulica = ulica;
		this.broj = broj;
		this.mesto = mesto;
	}

	public Adresa() {
		super();
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public Mesto getMesto() {
		return mesto;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

}
