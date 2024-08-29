package projekat.lms.dto;

import java.util.Set;


public class RegistrovaniKorisnikDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 6564050817281102873L;
	private String koriscnikoIme;
	private String lozinka;
	private String email;
	private String ime;
	private String prezime;
	private Set<UlogaDTO> uloge;
	
	public RegistrovaniKorisnikDTO() {
		super();
	}
	
	public String getKoriscnikoIme() {
		return koriscnikoIme;
	}
	public void setKoriscnikoIme(String koriscnikoIme) {
		this.koriscnikoIme = koriscnikoIme;
	}
	public String getLozinka() {
		return lozinka;
	}
	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
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
	
}
