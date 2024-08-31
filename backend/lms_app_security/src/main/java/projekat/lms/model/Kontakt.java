package projekat.lms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class Kontakt extends BaseEntity {

	@Column(nullable = false, columnDefinition = "TEXT")
	private String vrednost;

	@ManyToOne(optional = false)
	private TipKontakta tipKontakta;

	public Kontakt() {
		super();
	}

	public Kontakt(Long id, Boolean deleted, String vrednost, TipKontakta tipKontakta) {
		super(id, deleted);
		this.vrednost = vrednost;
		this.tipKontakta = tipKontakta;
	}

	public String getVrednost() {
		return vrednost;
	}

	public void setVrednost(String vrednost) {
		this.vrednost = vrednost;
	}

	public TipKontakta getTipKontakta() {
		return tipKontakta;
	}

	public void setTipKontakta(TipKontakta tipKontakta) {
		this.tipKontakta = tipKontakta;
	}

}
