package projekat.lms.model;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class Polaganje extends BaseEntity{
	@Column(nullable = false)
	private Integer bodovi;
	
	@Column(nullable = true)
	private String napomena;
	
	@Column(columnDefinition="tinyint(1) default 1")
	private boolean ispit;
	
	@Column(nullable = true)
	private Set<String> prestupi;
	
	@ManyToOne
	private StudentNaGodini studentNaGodini;
	
	@ManyToOne(optional = false)
	private EvaluacijaZnanja evaluacijaZnanja;

	public Polaganje() {
		super();
	}

	

	public Polaganje(Long id, Boolean deleted, Integer bodovi, String napomena, boolean ispit, Set<String> prestupi,
			StudentNaGodini studentNaGodini, EvaluacijaZnanja evaluacijaZnanja) {
		super(id, deleted);
		this.bodovi = bodovi;
		this.napomena = napomena;
		this.ispit = ispit;
		this.prestupi = prestupi;
		this.studentNaGodini = studentNaGodini;
		this.evaluacijaZnanja = evaluacijaZnanja;
	}



	public StudentNaGodini getStudentNaGodini() {
		return studentNaGodini;
	}

	public void setStudentNaGodini(StudentNaGodini studentNaGodini) {
		this.studentNaGodini = studentNaGodini;
	}

	public Integer getBodovi() {
		return bodovi;
	}

	public void setBodovi(Integer bodovi) {
		this.bodovi = bodovi;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public boolean isIspit() {
		return ispit;
	}

	public void setIspit(boolean ispit) {
		this.ispit = ispit;
	}

	public Set<String> getPrestupi() {
		return prestupi;
	}

	public void setPrestupi(Set<String> prestupi) {
		this.prestupi = prestupi;
	}

	public EvaluacijaZnanja getEvaluacijaZnanja() {
		return evaluacijaZnanja;
	}

	public void setEvaluacijaZnanja(EvaluacijaZnanja evaluacijaZnanja) {
		this.evaluacijaZnanja = evaluacijaZnanja;
	}
}
