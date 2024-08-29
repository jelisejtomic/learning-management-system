package projekat.lms.model;

import java.time.LocalDate;
import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class Student extends BaseEntity{
	@Column(columnDefinition = "VARCHAR(13)")
	private String jmbg;
	
	private LocalDate datumRodjenja;
	
	@OneToOne
	private Adresa adresa;
	
	@OneToMany(mappedBy = "student") 
	private ArrayList<StudentNaGodini> studentNaGodinama = new ArrayList<>();

	@OneToMany(mappedBy = "student")
	private ArrayList<PohadjanjePredmeta> pohadjanjaPredmeta = new ArrayList<>();

	public Student() {
		super();
	}

	public Student(Long id, String jmbg, LocalDate datumRodjenja, Adresa adresa,
			ArrayList<StudentNaGodini> studentNaGodinama, ArrayList<PohadjanjePredmeta> pohadjanjaPredmeta) {
		super(id);
		this.jmbg = jmbg;
		this.datumRodjenja = datumRodjenja;
		this.adresa = adresa;
		this.studentNaGodinama = studentNaGodinama;
		this.pohadjanjaPredmeta = pohadjanjaPredmeta;
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

	public ArrayList<StudentNaGodini> getstudentNaGodinama() {
		return studentNaGodinama;
	}

	public void setstudentNaGodinama(ArrayList<StudentNaGodini> studentNaGodinama) {
		this.studentNaGodinama = studentNaGodinama;
	}

	public ArrayList<PohadjanjePredmeta> getPohadjanjaPredmeta() {
		return pohadjanjaPredmeta;
	}

	public void setPohadjanjaPredmeta(ArrayList<PohadjanjePredmeta> pohadjanjaPredmeta) {
		this.pohadjanjaPredmeta = pohadjanjaPredmeta;
	}
	
	
}
