package projekat.lms.model;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class Fakultet extends BaseEntity{
	@Column(nullable = false, columnDefinition = "TEXT")
	private String naziv;
	
	@OneToOne
	private Nastavnik dekan;
	
	@OneToOne //proveriti
	private Adresa adresa;
	
	@OneToMany
	private Set<Kontakt> kontakti;
	
	@OneToMany(mappedBy = "fakultet")
	private Set<StudijskiProgram> studijskiProgrami;
	
	// not null value accessing a null or transient value?
	@ManyToOne(optional = false)
	private Univerzitet univerzitet;
	
	public Fakultet() {
		super();
	}
	
	

	public Fakultet(Long id, Boolean deleted, String naziv, Nastavnik dekan, Adresa adresa, Set<Kontakt> kontakti,
			Set<StudijskiProgram> studijskiProgrami, Univerzitet univerzitet) {
		super(id, deleted);
		this.naziv = naziv;
		this.dekan = dekan;
		this.adresa = adresa;
		this.kontakti = kontakti;
		this.studijskiProgrami = studijskiProgrami;
		this.univerzitet = univerzitet;
	}



	public Nastavnik getDekan() {
		return dekan;
	}

	public void setDekan(Nastavnik dekan) {
		this.dekan = dekan;
	}

	public Adresa getAdresa() {
		return adresa;
	}

	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}

	public Set<Kontakt> getKontakti() {
		return kontakti;
	}

	public void setKontakti(Set<Kontakt> kontakti) {
		this.kontakti = kontakti;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
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
