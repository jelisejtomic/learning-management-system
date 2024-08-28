package projekat.lms.model;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import projekat.lms.generics.BaseEntity;

@Entity
public class GodinaStudija extends BaseEntity{
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate godina;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate pocetak;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate kraj;
	
	@ManyToOne(optional = false)
	private StudijskiProgram studijskiProgram;
	
	@OneToMany
	private Set<Predmet> predmeti;
	
	
	public GodinaStudija() {
		super();
	}
	public GodinaStudija(Long id, LocalDate godina, LocalDate pocetak, LocalDate kraj,
			StudijskiProgram studijskiProgram, Set<Predmet> predmeti) {
		super(id);
		this.godina = godina;
		this.pocetak = pocetak;
		this.kraj = kraj;
		this.studijskiProgram = studijskiProgram;
		this.predmeti = predmeti;
	}




	public StudijskiProgram getStudijskiProgram() {
		return studijskiProgram;
	}
	public void setStudijskiProgram(StudijskiProgram studijskiProgram) {
		this.studijskiProgram = studijskiProgram;
	}
	public Set<Predmet> getPredmeti() {
		return predmeti;
	}
	public void setPredmeti(Set<Predmet> predmeti) {
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
