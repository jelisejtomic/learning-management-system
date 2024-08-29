package projekat.lms.dto;

import java.time.LocalDate;
import java.util.Set;


public class GodinaStudijaDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 2283502693035968042L;
	private Long id;
	private LocalDate godina;
	private LocalDate pocetak;
	private LocalDate kraj;
	
	private Set<StudijskiProgramDTO> studijskiProgrami;
	private Set<PredmetDTO> predmeti;
	
	public GodinaStudijaDTO() {
		super();
	}
	
	public GodinaStudijaDTO(Long id, LocalDate godina, LocalDate pocetak, LocalDate kraj,
			Set<StudijskiProgramDTO> studijskiProgrami, Set<PredmetDTO> predmeti) {
		super();
		this.id = id;
		this.godina = godina;
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.studijskiProgrami = studijskiProgrami;
		this.predmeti = predmeti;
	}

	public Set<StudijskiProgramDTO> getStudijskiProgrami() {
		return studijskiProgrami;
	}

	public void setStudijskiProgrami(Set<StudijskiProgramDTO> studijskiProgrami) {
		this.studijskiProgrami = studijskiProgrami;
	}

	public Set<PredmetDTO> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(Set<PredmetDTO> predmeti) {
		this.predmeti = predmeti;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getGodina() {
		return godina;
	}
	public void setGodina(LocalDate godina) {
		this.godina = godina;
	}
	public LocalDate getPocetak() {
		return pocetak;
	}
	public void setPocetak(LocalDate pocetak) {
		this.pocetak = pocetak;
	}
	public LocalDate getKraj() {
		return kraj;
	}
	public void setKraj(LocalDate kraj) {
		this.kraj = kraj;
	}
}
