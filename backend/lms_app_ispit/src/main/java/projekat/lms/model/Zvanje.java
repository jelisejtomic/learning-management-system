package projekat.lms.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class Zvanje extends BaseEntity {
	@Column(nullable = false)
	private LocalDate datumIzbora;

	@Column(nullable = false)
	private LocalDate datumPrestanka;

	@ManyToOne
	private NaucnaOblast naucnaOblast;

	@ManyToOne
	private TipZvanja tipZvanja;

	public Zvanje() {
		super();
	}

	public Zvanje(Long id, Boolean deleted, LocalDate datumIzbora, LocalDate datumPrestanka, NaucnaOblast naucnaOblast,
			TipZvanja tipZvanja) {
		super(id, deleted);
		this.datumIzbora = datumIzbora;
		this.datumPrestanka = datumPrestanka;
		this.naucnaOblast = naucnaOblast;
		this.tipZvanja = tipZvanja;
	}

	public LocalDate getDatumIzbora() {
		return datumIzbora;
	}

	public void setDatumIzbora(LocalDate datumIzbora) {
		this.datumIzbora = datumIzbora;
	}

	public LocalDate getDatumPrestanka() {
		return datumPrestanka;
	}

	public void setDatumPrestanka(LocalDate datumPrestanka) {
		this.datumPrestanka = datumPrestanka;
	}

	public NaucnaOblast getNaucnaOblast() {
		return naucnaOblast;
	}

	public void setNaucnaOblast(NaucnaOblast naucnaOblast) {
		this.naucnaOblast = naucnaOblast;
	}

	public TipZvanja getTipZvanja() {
		return tipZvanja;
	}

	public void setTipZvanja(TipZvanja tipZvanja) {
		this.tipZvanja = tipZvanja;
	}
}
