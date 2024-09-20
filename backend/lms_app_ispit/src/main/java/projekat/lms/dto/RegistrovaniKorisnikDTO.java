package projekat.lms.dto;

import java.io.Serializable;
import java.util.Set;

import projekat.lms.generics.BaseDTO;

public class RegistrovaniKorisnikDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 6564050817281102873L;
	private String korisnickoIme;
	private String email;
	private String ime;
	private String prezime;
	private Set<UlogaDTO> uloge;

	public RegistrovaniKorisnikDTO() {
		super();
	}

	public RegistrovaniKorisnikDTO(Long id, Boolean deleted, String korisnickoIme, String email, String ime,
			String prezime, Set<UlogaDTO> uloge) {
		super(id, deleted);
		this.korisnickoIme = korisnickoIme;
		this.email = email;
		this.ime = ime;
		this.prezime = prezime;
		this.uloge = uloge;
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public Set<UlogaDTO> getUloge() {
		return uloge;
	}

	public void setUloge(Set<UlogaDTO> uloge) {
		this.uloge = uloge;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}