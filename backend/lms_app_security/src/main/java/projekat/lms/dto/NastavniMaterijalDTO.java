package projekat.lms.dto;

import java.io.Serializable;
import java.util.Set;

import projekat.lms.generics.BaseDTO;

public class NastavniMaterijalDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 356710044087597874L;
	private String naziv;
	private Integer godinaIzdavanja;
	private Set<String> autori;
	private Set<FajlDTO> fajlovi;

	public NastavniMaterijalDTO() {
		super();
	}

	public NastavniMaterijalDTO(Long id, Boolean deleted, String naziv, Integer godinaIzdavanja, Set<String> autori,
			Set<FajlDTO> fajlovi) {
		super(id, deleted);
		this.naziv = naziv;
		this.godinaIzdavanja = godinaIzdavanja;
		this.autori = autori;
		this.fajlovi = fajlovi;
	}

	public Set<FajlDTO> getFajlovi() {
		return fajlovi;
	}

	public void setFajlovi(Set<FajlDTO> fajlovi) {
		this.fajlovi = fajlovi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Integer getGodinaIzdavanja() {
		return godinaIzdavanja;
	}

	public void setGodinaIzdavanja(Integer godinaIzdavanja) {
		this.godinaIzdavanja = godinaIzdavanja;
	}

	public Set<String> getAutori() {
		return autori;
	}

	public void setAutori(Set<String> autori) {
		this.autori = autori;
	}

}
