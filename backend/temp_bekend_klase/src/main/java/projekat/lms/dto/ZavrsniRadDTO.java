package projekat.lms.dto;

import java.io.Serializable;
import java.util.Set;

import projekat.lms.generics.BaseDTO;

public class ZavrsniRadDTO extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 4490604472890814876L;
	
	private String naziv;
	
	private Set<FajlDTO> fajlovi;
	private NastavnikDTO mentor;
	
	public ZavrsniRadDTO() {
		super();
	}
	
	public ZavrsniRadDTO(Long id, Boolean deleted, String naziv, Set<FajlDTO> fajlovi, NastavnikDTO mentor) {
		super(id, deleted);
		this.naziv = naziv;
		this.fajlovi = fajlovi;
		this.mentor = mentor;
	}

	public Set<FajlDTO> getFajlovi() {
		return fajlovi;
	}

	public void setFajlovi(Set<FajlDTO> fajlovi) {
		this.fajlovi = fajlovi;
	}

	public NastavnikDTO getMentor() {
		return mentor;
	}

	public void setMentor(NastavnikDTO mentor) {
		this.mentor = mentor;
	}


	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
