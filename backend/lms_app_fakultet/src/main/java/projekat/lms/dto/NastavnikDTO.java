package projekat.lms.dto;

import java.io.Serializable;
import java.util.Set;

import projekat.lms.generics.BaseDTO;

public class NastavnikDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 4404900526680285447L;
	private RegistrovaniKorisnikDTO korisnik;
	private String jmbg;
	private String biografija;
	private Set<ZvanjeDTO> zvanja;

	public NastavnikDTO() {
		super();
	}

	public NastavnikDTO(Long id, Boolean deleted, RegistrovaniKorisnikDTO korisnik, String jmbg, String biografija,
			Set<ZvanjeDTO> zvanja) {
		super(id, deleted);
		this.korisnik = korisnik;
		this.jmbg = jmbg;
		this.biografija = biografija;
		this.zvanja = zvanja;
	}

	public RegistrovaniKorisnikDTO getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(RegistrovaniKorisnikDTO korisnik) {
		this.korisnik = korisnik;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getBiografija() {
		return biografija;
	}

	public void setBiografija(String biografija) {
		this.biografija = biografija;
	}

	public Set<ZvanjeDTO> getZvanja() {
		return zvanja;
	}

	public void setZvanja(Set<ZvanjeDTO> zvanja) {
		this.zvanja = zvanja;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}

