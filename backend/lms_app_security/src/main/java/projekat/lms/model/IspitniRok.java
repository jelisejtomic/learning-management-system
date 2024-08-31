package projekat.lms.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import projekat.lms.generics.BaseEntity;

@Entity
public class IspitniRok extends BaseEntity {
	@Column(nullable = false, columnDefinition = "TEXT")
	private String naziv;

	@Column(nullable = false)
	private LocalDateTime pocetakRoka;
	@Column(nullable = false)
	private LocalDateTime krajRoka;

	public IspitniRok() {
		super();
	}

	public IspitniRok(Long id, Boolean deleted, String naziv, LocalDateTime pocetakRoka, LocalDateTime krajRoka) {
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

	public LocalDateTime getPocetakRoka() {
		return pocetakRoka;
	}

	public void setPocetakRoka(LocalDateTime pocetakRoka) {
		this.pocetakRoka = pocetakRoka;
	}

	public LocalDateTime getKrajRoka() {
		return krajRoka;
	}

	public void setKrajRoka(LocalDateTime krajRoka) {
		this.krajRoka = krajRoka;
	}

}
