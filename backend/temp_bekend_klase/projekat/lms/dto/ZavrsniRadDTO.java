package projekat.lms.dto;

import java.io.Serializable;
import java.util.Set;

public class ZavrsniRadDTO extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 4490604472890814876L;
	private Long id;
	
	private String naziv;
	
	private Set<FajlDTO> fajlovi;
	private NastavnikDTO mentor;
	
	public ZavrsniRadDTO() {
		super();
	}
	
	public ZavrsniRadDTO(Long id, String naziv, Set<FajlDTO> fajlovi, NastavnikDTO mentor) {
		super();
		this.id = id;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
