package projekat.lms.model;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class GodinaStudija extends BaseEntity {
	@Column(nullable = false)
	private Integer godina;

	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate pocetak;

	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate kraj;

	@ManyToOne(optional = false)
	private StudijskiProgram studijskiProgram;

	@ManyToMany
	private Set<Predmet> predmeti;

	public GodinaStudija() {
		super();
	}

	public GodinaStudija(Long id, Boolean deleted, Integer godina, LocalDate pocetak, LocalDate kraj,
			StudijskiProgram studijskiProgram, Set<Predmet> predmeti) {
		super(id, deleted);
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

	public Integer getGodina() {
		return godina;
	}

	public void setGodina(Integer godina) {
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
