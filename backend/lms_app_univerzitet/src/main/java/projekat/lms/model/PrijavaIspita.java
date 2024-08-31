package projekat.lms.model;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class PrijavaIspita extends BaseEntity{
	@ManyToOne
	private RealizacijaPredmeta realizacijaPredmeta;
	@ManyToOne
	private EvaluacijaZnanja evaluacijaZnanja;
	@ManyToOne
	private IspitniRok ispitniRok;
	@ManyToOne
	private StudentNaGodini studentNaGodini;
	
	@Column(nullable = false)
	private LocalDateTime vremePrijave;

	public PrijavaIspita() {
		super();
	}

	public PrijavaIspita(Long id, Boolean deleted, RealizacijaPredmeta realizacijaPredmeta,
			EvaluacijaZnanja evaluacijaZnanja, IspitniRok ispitniRok, StudentNaGodini studentNaGodini,
			LocalDateTime vremePrijave) {
		super(id, deleted);
		this.realizacijaPredmeta = realizacijaPredmeta;
		this.evaluacijaZnanja = evaluacijaZnanja;
		this.ispitniRok = ispitniRok;
		this.studentNaGodini = studentNaGodini;
		this.vremePrijave = vremePrijave;
	}

	public RealizacijaPredmeta getRealizacijaPredmeta() {
		return realizacijaPredmeta;
	}

	public void setRealizacijaPredmeta(RealizacijaPredmeta realizacijaPredmeta) {
		this.realizacijaPredmeta = realizacijaPredmeta;
	}

	public EvaluacijaZnanja getEvaluacijaZnanja() {
		return evaluacijaZnanja;
	}

	public void setEvaluacijaZnanja(EvaluacijaZnanja evaluacijaZnanja) {
		this.evaluacijaZnanja = evaluacijaZnanja;
	}

	public IspitniRok getIspitniRok() {
		return ispitniRok;
	}

	public void setIspitniRok(IspitniRok ispitniRok) {
		this.ispitniRok = ispitniRok;
	}

	public StudentNaGodini getStudentNaGodini() {
		return studentNaGodini;
	}

	public void setStudentNaGodini(StudentNaGodini studentNaGodini) {
		this.studentNaGodini = studentNaGodini;
	}

	public LocalDateTime getVremePrijave() {
		return vremePrijave;
	}

	public void setVremePrijave(LocalDateTime vremePrijave) {
		this.vremePrijave = vremePrijave;
	}
		
}
