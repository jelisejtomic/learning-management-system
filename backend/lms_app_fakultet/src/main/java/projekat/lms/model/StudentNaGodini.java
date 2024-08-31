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
public class StudentNaGodini extends BaseEntity{
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate datumUpisa;
	
	@Column(nullable = false, columnDefinition = "TEXT")
	private String brojIndeksa;
	
	@ManyToOne
	private GodinaStudija godinaStudija;
	
	@OneToMany(mappedBy = "studentNaGodini")
	private List<Polaganje> polaganja = new ArrayList<Polaganje>();
	
	@OneToOne
	private OdbranaZavrsnogRada odbranaZavrsnogRada;
	
	@OneToOne
	private ZavrsniRad zavrsniRad;
	
	@ManyToOne
	private Student student;
	
	@OneToMany(mappedBy = "studentNaGodini")
	private List<PrijavaIspita> prijaveIspita;
	

	public StudentNaGodini() {
		super();
	}
	
	
	public StudentNaGodini(Long id, Boolean deleted, LocalDate datumUpisa, String brojIndeksa,
			GodinaStudija godinaStudija, List<Polaganje> polaganja, OdbranaZavrsnogRada odbranaZavrsnogRada,
			ZavrsniRad zavrsniRad, Student student, List<PrijavaIspita> prijaveIspita) {
		super(id, deleted);
		this.datumUpisa = datumUpisa;
		this.brojIndeksa = brojIndeksa;
		this.godinaStudija = godinaStudija;
		this.polaganja = polaganja;
		this.odbranaZavrsnogRada = odbranaZavrsnogRada;
		this.zavrsniRad = zavrsniRad;
		this.student = student;
		this.prijaveIspita = prijaveIspita;
	}


	public LocalDate getDatumUpisa() {
		return datumUpisa;
	}


	public void setDatumUpisa(LocalDate datumUpisa) {
		this.datumUpisa = datumUpisa;
	}


	public String getBrojIndeksa() {
		return brojIndeksa;
	}


	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}


	public GodinaStudija getGodinaStudija() {
		return godinaStudija;
	}


	public void setGodinaStudija(GodinaStudija godinaStudija) {
		this.godinaStudija = godinaStudija;
	}


	public List<Polaganje> getPolaganja() {
		return polaganja;
	}


	public void setPolaganja(List<Polaganje> polaganja) {
		this.polaganja = polaganja;
	}


	public OdbranaZavrsnogRada getOdbranaZavrsnogRada() {
		return odbranaZavrsnogRada;
	}


	public void setOdbranaZavrsnogRada(OdbranaZavrsnogRada odbranaZavrsnogRada) {
		this.odbranaZavrsnogRada = odbranaZavrsnogRada;
	}


	public ZavrsniRad getZavrsniRad() {
		return zavrsniRad;
	}


	public void setZavrsniRad(ZavrsniRad zavrsniRad) {
		this.zavrsniRad = zavrsniRad;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public List<PrijavaIspita> getPrijaveIspita() {
		return prijaveIspita;
	}


	public void setPrijaveIspita(List<PrijavaIspita> prijaveIspita) {
		this.prijaveIspita = prijaveIspita;
	}

	
	
}
