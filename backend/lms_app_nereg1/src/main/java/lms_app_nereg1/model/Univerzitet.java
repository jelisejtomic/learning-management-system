package lms_app_nereg1.model;
import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;

@Entity
public class Univerzitet{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String naziv;
	private LocalDateTime datumOsnivanja;
	@Lob
	private String opis;

	@OneToMany(mappedBy = "univerzitet")
	private Set<Fakultet> fakulteti;
	
	// kontakti Kontakt []
	private Set<String> kontakti;
	
	// adrese Adresa []
	private Set<String> adrese;
	
	// rektor Nastavnik
	private String rektor;

	public Univerzitet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Univerzitet(Long id, String naziv, LocalDateTime datumOsnivanja, String opis, Set<Fakultet> fakulteti,
			Set<String> kontakti, Set<String> adrese, String rektor) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.datumOsnivanja = datumOsnivanja;
		this.opis = opis;
		this.fakulteti = fakulteti;
		this.kontakti = kontakti;
		this.adrese = adrese;
		this.rektor = rektor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Set<String> getKontakti() {
		return kontakti;
	}

	public void setKontakti(Set<String> kontakti) {
		this.kontakti = kontakti;
	}

	public Set<String> getAdrese() {
		return adrese;
	}

	public void setAdrese(Set<String> adrese) {
		this.adrese = adrese;
	}

	public String getRektor() {
		return rektor;
	}

	public void setRektor(String rektor) {
		this.rektor = rektor;
	}
	
	
	
}
