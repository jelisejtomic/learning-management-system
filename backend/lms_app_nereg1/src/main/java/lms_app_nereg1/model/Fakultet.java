package lms_app_nereg1.model;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Fakultet{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "fakultet")
	private Set<StudijskiProgram> studijskiProgrami;

	// naziv String
	private String naziv;
	
	// dekan Nastavnik
	private String dekan;
	
	// adresa Adresa
	private String adresa;
	
	// kontakti Kontakt []
	private Set<String> kontakti;
	
	// not null value accessing a null or transient value?
	@ManyToOne(optional = false)
	private Univerzitet univerzitet;
	
	


	public Fakultet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Fakultet(Long id, Set<StudijskiProgram> studijskiProgrami, String naziv, String dekan, String adresa,
			Set<String> kontakti, Univerzitet univerzitet) {
		super();
		this.id = id;
		this.studijskiProgrami = studijskiProgrami;
		this.naziv = naziv;
		this.dekan = dekan;
		this.adresa = adresa;
		this.kontakti = kontakti;
		this.univerzitet = univerzitet;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getDekan() {
		return dekan;
	}

	public void setDekan(String dekan) {
		this.dekan = dekan;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public Set<String> getKontakti() {
		return kontakti;
	}

	public void setKontakti(Set<String> kontakti) {
		this.kontakti = kontakti;
	}

	public Univerzitet getUniverzitet() {
		return univerzitet;
	}

	public void setUniverzitet(Univerzitet univerzitet) {
		this.univerzitet = univerzitet;
	}

	public Set<StudijskiProgram> getStudijskiProgrami() {
		return studijskiProgrami;
	}

	public void setStudijskiProgrami(Set<StudijskiProgram> studijskiProgrami) {
		this.studijskiProgrami = studijskiProgrami;
	}
	
	
}
