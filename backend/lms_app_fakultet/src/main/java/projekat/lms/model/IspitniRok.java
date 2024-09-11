package projekat.lms.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import projekat.lms.generics.BaseEntity;

@Entity
public class IspitniRok extends BaseEntity {
	@Column(nullable = false, columnDefinition = "TEXT")
	private String naziv;

	@Column(nullable = false)
	private LocalDate pocetakRoka;

	@Column(nullable = false)
	private LocalDate krajRoka;

	public IspitniRok() {
		super();
	}

	public IspitniRok(Long id, Boolean deleted, String naziv, LocalDate pocetakRoka, LocalDate krajRoka) {
		super(id, deleted);
		this.naziv = naziv;
		this.pocetakRoka = pocetakRoka;
		this.krajRoka = krajRoka;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public LocalDate getPocetakRoka() {
		return pocetakRoka;
	}

	public void setPocetakRoka(LocalDate pocetakRoka) {
		this.pocetakRoka = pocetakRoka;
	}

	public LocalDate getKrajRoka() {
		return krajRoka;
	}

	public void setKrajRoka(LocalDate krajRoka) {
		this.krajRoka = krajRoka;
	}

}
