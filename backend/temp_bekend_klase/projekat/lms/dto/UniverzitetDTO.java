package projekat.lms.dto;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;


public class UniverzitetDTO extends BaseDTO implements Serializable{
	private static final long serialVersionUID = -5155900689286442503L;
	private Long id;
	private String naziv;
	private LocalDateTime datumOsnivanja;
	private String opis;
	
	private Set<FakultetDTO> fakulteti;
	private Set<KontaktDTO> kontakti;
	private Set<AdresaDTO> adrese;
	private NastavnikDTO rektor;
	

	public UniverzitetDTO() {
		super();
	}
	
	public UniverzitetDTO(Long id, String naziv, LocalDateTime datumOsnivanja, String opis, Set<FakultetDTO> fakulteti,
			Set<KontaktDTO> kontakti, Set<AdresaDTO> adrese, NastavnikDTO rektor) {
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

	public Set<KontaktDTO> getKontakti() {
		return kontakti;
	}

	public void setKontakti(Set<KontaktDTO> kontakti) {
		this.kontakti = kontakti;
	}

	public Set<AdresaDTO> getAdrese() {
		return adrese;
	}

	public void setAdrese(Set<AdresaDTO> adrese) {
		this.adrese = adrese;
	}

	public NastavnikDTO getRektor() {
		return rektor;
	}

	public void setRektor(NastavnikDTO rektor) {
		this.rektor = rektor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
}
