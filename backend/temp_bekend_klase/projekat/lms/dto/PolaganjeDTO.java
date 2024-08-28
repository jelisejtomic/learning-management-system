package projekat.lms.dto;

import java.io.Serializable;
import java.util.Set;


public class PolaganjeDTO implements Serializable{
	private static final long serialVersionUID = -7533606543316934291L;
	private Long id;
	
	private Integer bodovi;
	private String napomena;
	private boolean ispit;
	private Set<String> prestupi;
	
	private StudentNaGodiniDTO studentNaGodini;
	private EvaluacijaZnanjaDTO evaluacijaZnanja;
	

	public PolaganjeDTO() {
		super();
	}

	
	public PolaganjeDTO(Long id, Integer bodovi, String napomena, boolean ispit, Set<String> prestupi,
			StudentNaGodiniDTO studentNaGodini, EvaluacijaZnanjaDTO evaluacijaZnanja) {
		super();
		this.id = id;
		this.bodovi = bodovi;
		this.napomena = napomena;
		this.ispit = ispit;
		this.prestupi = prestupi;
		this.studentNaGodini = studentNaGodini;
		this.evaluacijaZnanja = evaluacijaZnanja;
	}


	public StudentNaGodiniDTO getStudentNaGodini() {
		return studentNaGodini;
	}


	public void setStudentNaGodini(StudentNaGodiniDTO studentNaGodini) {
		this.studentNaGodini = studentNaGodini;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public EvaluacijaZnanjaDTO getEvaluacijaZnanja() {
		return evaluacijaZnanja;
	}

	public void setEvaluacijaZnanja(EvaluacijaZnanjaDTO evaluacijaZnanja) {
		this.evaluacijaZnanja = evaluacijaZnanja;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
