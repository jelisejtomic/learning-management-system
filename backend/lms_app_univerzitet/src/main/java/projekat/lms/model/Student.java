package projekat.lms.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class Student extends BaseEntity {
	@ManyToOne
	private RegistrovaniKorisnik korisnik;

	@Column(columnDefinition = "VARCHAR(13)")
	private String jmbg;

	private LocalDate datumRodjenja;

	@OneToOne
	private Adresa adresa;

	@OneToMany(mappedBy = "student")
	private List<StudentNaGodini> studentNaGodinama = new ArrayList<>();

	@OneToMany(mappedBy = "student")
	private List<PohadjanjePredmeta> pohadjanjaPredmeta = new ArrayList<>();

	public Student() {
		super();
	}

	public Student(Long id, Boolean deleted, RegistrovaniKorisnik korisnik, String jmbg, LocalDate datumRodjenja,
			Adresa adresa, List<StudentNaGodini> studentNaGodinama, List<PohadjanjePredmeta> pohadjanjaPredmeta) {
		super(id, deleted);
		this.korisnik = korisnik;
		this.jmbg = jmbg;
		this.datumRodjenja = datumRodjenja;
		this.adresa = adresa;
		this.studentNaGodinama = studentNaGodinama;
		this.pohadjanjaPredmeta = pohadjanjaPredmeta;
	}

	public RegistrovaniKorisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(RegistrovaniKorisnik korisnik) {
		this.korisnik = korisnik;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public LocalDate getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(LocalDate datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public Adresa getAdresa() {
		return adresa;
	}

	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}

	public List<PohadjanjePredmeta> getPohadjanjaPredmeta() {
		return pohadjanjaPredmeta;
	}

	public List<StudentNaGodini> getStudentNaGodinama() {
		return studentNaGodinama;
	}

	public void setStudentNaGodinama(List<StudentNaGodini> studentNaGodinama) {
		this.studentNaGodinama = studentNaGodinama;
	}

	public void setPohadjanjaPredmeta(List<PohadjanjePredmeta> pohadjanjaPredmeta) {
		this.pohadjanjaPredmeta = pohadjanjaPredmeta;
	}

}
