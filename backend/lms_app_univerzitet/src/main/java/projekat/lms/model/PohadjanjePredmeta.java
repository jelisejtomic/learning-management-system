package projekat.lms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class PohadjanjePredmeta extends BaseEntity{
	
	@Column(nullable = false, columnDefinition = "INT")
	private Integer konacnaOcena;
	
	@Column(nullable = false, columnDefinition = "INT")
	private Integer bodovi;
	
	@Column(nullable = false, columnDefinition = "INT")
	private Integer bonusBodovi;

	@ManyToOne
	private Student student;

	@ManyToOne
	private RealizacijaPredmeta realizacijaPredmeta;

	public PohadjanjePredmeta() {
		super();
	}
	
	

	public PohadjanjePredmeta(Long id, Boolean deleted, Integer konacnaOcena, Integer bodovi, Integer bonusBodovi,
			Student student, RealizacijaPredmeta realizacijaPredmeta) {
		super(id, deleted);
		this.konacnaOcena = konacnaOcena;
		this.bodovi = bodovi;
		this.bonusBodovi = bonusBodovi;
		this.student = student;
		this.realizacijaPredmeta = realizacijaPredmeta;
	}



	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public RealizacijaPredmeta getRealizacijaPredmeta() {
		return realizacijaPredmeta;
	}

	public void setRealizacijaPredmeta(RealizacijaPredmeta realizacijaPredmeta) {
		this.realizacijaPredmeta = realizacijaPredmeta;
	}

	public Integer getKonacnaOcena() {
		return konacnaOcena;
	}

	public void setKonacnaOcena(Integer konacnaOcena) {
		this.konacnaOcena = konacnaOcena;
	}

	public Integer getBodovi() {
		return bodovi;
	}

	public void setBodovi(Integer bodovi) {
		this.bodovi = bodovi;
	}

	public Integer getBonusBodovi() {
		return bonusBodovi;
	}

	public void setBonusBodovi(Integer bonusBodovi) {
		this.bonusBodovi = bonusBodovi;
	}
	
	
	
}
