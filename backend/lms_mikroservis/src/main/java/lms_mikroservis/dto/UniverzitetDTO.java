package lms_mikroservis.dto;

import java.time.LocalDateTime;
import java.util.Set;


public class UniverzitetDTO{
	private Long id;
	private String naziv;
	private LocalDateTime datumOsnivanja;
	private String opis;
	
	private Set<FakultetDTO> fakulteti;
	
	// kontakti Kontaktdto []
	private Set<String> kontakti;
	
	// adrese Adresadto []
	private Set<String> adrese;
	
	// rektor Nastavnikdto
	private String rektor;

	public UniverzitetDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UniverzitetDTO(Long id, String naziv, LocalDateTime datumOsnivanja, String opis, Set<FakultetDTO> fakulteti,
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

	public Set<FakultetDTO> getFakulteti() {
		return fakulteti;
	}

	public void setFakulteti(Set<FakultetDTO> fakulteti) {
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
