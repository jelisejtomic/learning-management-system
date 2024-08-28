package projekat.lms.model;
import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class Univerzitet extends BaseEntity{	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String naziv;
	
	@Column(nullable = false)
	private LocalDateTime datumOsnivanja;

	@Column(nullable = false, columnDefinition = "TEXT")	
	private String opis;

	@OneToMany(mappedBy = "univerzitet")
	private Set<Fakultet> fakulteti;
	
	@OneToMany
	private Set<Kontakt> kontakti;
	
	@OneToMany
	private Set<Adresa> adrese;
	
	@OneToOne
	private Nastavnik rektor;

	public Univerzitet() {
		super();
	}
	
	public Univerzitet(Long id, String naziv, LocalDateTime datumOsnivanja, String opis, Set<Fakultet> fakulteti,
			Set<Kontakt> kontakti, Set<Adresa> adrese, Nastavnik rektor) {
		super(id);
		this.naziv = naziv;
		this.datumOsnivanja = datumOsnivanja;
		this.opis = opis;
		this.fakulteti = fakulteti;
		this.kontakti = kontakti;
		this.adrese = adrese;
		this.rektor = rektor;
	}

	public Set<Kontakt> getKontakti() {
		return kontakti;
	}

	public void setKontakti(Set<Kontakt> kontakti) {
		this.kontakti = kontakti;
	}

	public Set<Adresa> getAdrese() {
		return adrese;
	}

	public void setAdrese(Set<Adresa> adrese) {
		this.adrese = adrese;
	}

	public Nastavnik getRektor() {
		return rektor;
	}

	public void setRektor(Nastavnik rektor) {
		this.rektor = rektor;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public LocalDateTime getDatumOsnivanja() {
		return datumOsnivanja;
	}

	public void setDatumOsnivanja(LocalDateTime datumOsnivanja) {
		this.datumOsnivanja = datumOsnivanja;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Set<Fakultet> getFakulteti() {
		return fakulteti;
	}

	public void setFakulteti(Set<Fakultet> fakulteti) {
		this.fakulteti = fakulteti;
	}
}
