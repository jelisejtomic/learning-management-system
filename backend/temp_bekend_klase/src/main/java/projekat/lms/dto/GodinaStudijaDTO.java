package projekat.lms.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import projekat.lms.generics.BaseDTO;


public class GodinaStudijaDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 2283502693035968042L;
	private LocalDate godina;
	private LocalDate pocetak;
	private LocalDate kraj;
	
	private StudijskiProgramDTO studijskiProgram;
	private Set<PredmetDTO> predmeti;
	
	public GodinaStudijaDTO() {
		super();
	}
	

	public GodinaStudijaDTO(Long id, Boolean deleted, LocalDate godina, LocalDate pocetak, LocalDate kraj,
			StudijskiProgramDTO studijskiProgram, Set<PredmetDTO> predmeti) {
		super(id, deleted);
		this.godina = godina;
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.studijskiProgram = studijskiProgram;
		this.predmeti = predmeti;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public StudijskiProgramDTO getStudijskiProgram() {
		return studijskiProgram;
	}


	public void setStudijskiProgram(StudijskiProgramDTO studijskiProgram) {
		this.studijskiProgram = studijskiProgram;
	}


	public Set<PredmetDTO> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(Set<PredmetDTO> predmeti) {
		this.predmeti = predmeti;
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
