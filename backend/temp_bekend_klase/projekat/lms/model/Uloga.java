package projekat.lms.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import projekat.lms.generics.BaseEntity;

@Entity
public class Uloga extends BaseEntity{
	@Column(nullable = false)
	private String naziv;
	
	private LocalDateTime datumDodeljivanja;

	public Uloga() {
		super();
	}

	public Uloga(Long id, String naziv, LocalDateTime datumDodeljivanja) {
		super(id);
		this.naziv = naziv;
		this.datumDodeljivanja = datumDodeljivanja;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public LocalDateTime getDatumDodeljivanja() {
		return datumDodeljivanja;
	}

	public void setDatumDodeljivanja(LocalDateTime datumDodeljivanja) {
		this.datumDodeljivanja = datumDodeljivanja;
	}
	
}
