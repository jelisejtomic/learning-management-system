package projekat.lms.model;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import projekat.lms.generics.BaseEntity;

@Entity
public class Dokument extends BaseEntity{
	@Column(nullable = false, columnDefinition = "TEXT")
	private String naziv;
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String opis;
	
	@Column(nullable = false)
	private LocalDateTime datumIzdavanja; 
	
	@OneToMany
	private Set<Fajl> fajlovi = new HashSet<>();
	
	@ManyToOne(optional = false)
	private TipDokumenta tipDokumenta;
	
	

	public Dokument() {
		super();
	}

	public Dokument(Long id, boolean deleted, String naziv, String opis, LocalDateTime datumIzdavanja,
			Set<Fajl> fajlovi, TipDokumenta tipDokumenta) {
		super(id, deleted);
		this.naziv = naziv;
		this.opis = opis;
		this.datumIzdavanja = datumIzdavanja;
		this.fajlovi = fajlovi;
		this.tipDokumenta = tipDokumenta;
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

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public LocalDateTime getDatumIzdavanja() {
		return datumIzdavanja;
	}

	public void setDatumIzdavanja(LocalDateTime datumIzdavanja) {
		this.datumIzdavanja = datumIzdavanja;
	}

	public TipDokumenta getTipDokumenta() {
		return tipDokumenta;
	}

	public void setTipDokumenta(TipDokumenta tipDokumenta) {
		this.tipDokumenta = tipDokumenta;
	}
	
	
}
