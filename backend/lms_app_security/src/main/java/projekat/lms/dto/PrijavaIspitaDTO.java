package projekat.lms.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import projekat.lms.generics.BaseDTO;

public class PrijavaIspitaDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 816266087582748706L;
	private RealizacijaPredmetaDTO realizacijaPredmeta;
	private EvaluacijaZnanjaDTO evaluacijaZnanja;
	private IspitniRokDTO ispitniRok;
	private StudentNaGodiniDTO studentNaGodini;
	private LocalDateTime vremePrijave;

	public PrijavaIspitaDTO() {
		super();
	}

	public PrijavaIspitaDTO(Long id, Boolean deleted, RealizacijaPredmetaDTO realizacijaPredmeta,
			EvaluacijaZnanjaDTO evaluacijaZnanja, IspitniRokDTO ispitniRok, StudentNaGodiniDTO studentNaGodini,
			LocalDateTime vremePrijave) {
		super(id, deleted);
		this.realizacijaPredmeta = realizacijaPredmeta;
		this.evaluacijaZnanja = evaluacijaZnanja;
		this.ispitniRok = ispitniRok;
		this.studentNaGodini = studentNaGodini;
		this.vremePrijave = vremePrijave;
	}

	public RealizacijaPredmetaDTO getRealizacijaPredmeta() {
		return realizacijaPredmeta;
	}

	public void setRealizacijaPredmeta(RealizacijaPredmetaDTO realizacijaPredmeta) {
		this.realizacijaPredmeta = realizacijaPredmeta;
	}

	public EvaluacijaZnanjaDTO getEvaluacijaZnanja() {
		return evaluacijaZnanja;
	}

	public void setEvaluacijaZnanja(EvaluacijaZnanjaDTO evaluacijaZnanja) {
		this.evaluacijaZnanja = evaluacijaZnanja;
	}

	public IspitniRokDTO getIspitniRok() {
		return ispitniRok;
	}

	public void setIspitniRok(IspitniRokDTO ispitniRok) {
		this.ispitniRok = ispitniRok;
	}

	public StudentNaGodiniDTO getStudentNaGodini() {
		return studentNaGodini;
	}

	public void setStudentNaGodini(StudentNaGodiniDTO studentNaGodini) {
		this.studentNaGodini = studentNaGodini;
	}

	public LocalDateTime getVremePrijave() {
		return vremePrijave;
	}

	public void setVremePrijave(LocalDateTime vremePrijave) {
		this.vremePrijave = vremePrijave;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
