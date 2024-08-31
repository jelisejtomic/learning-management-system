package projekat.lms.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class TerminNastave extends BaseEntity {
	@Column(nullable = false)
	private LocalDateTime vremePocetka;

	@Column(nullable = false)
	private LocalDateTime vremeKraja;

	@Column(nullable = false)
	private String mestoOdrzavanja;

	@OneToOne(optional = false)
	private Ishod ishod;

	@ManyToOne(optional = false)
	private RealizacijaPredmeta realizacijaPredmeta;

	@ManyToOne(optional = false)
	private TipNastave tipNastave;

	public TerminNastave() {
		super();
	}

	public TerminNastave(Long id, Boolean deleted, LocalDateTime vremePocetka, LocalDateTime vremeKraja,
			String mestoOdrzavanja, Ishod ishod, RealizacijaPredmeta realizacijaPredmeta, TipNastave tipNastave) {
		super(id, deleted);
		this.vremePocetka = vremePocetka;
		this.vremeKraja = vremeKraja;
		this.mestoOdrzavanja = mestoOdrzavanja;
		this.ishod = ishod;
		this.realizacijaPredmeta = realizacijaPredmeta;
		this.tipNastave = tipNastave;
	}

	public RealizacijaPredmeta getRealizacijaPredmeta() {
		return realizacijaPredmeta;
	}

	public void setRealizacijaPredmeta(RealizacijaPredmeta realizacijaPredmeta) {
		this.realizacijaPredmeta = realizacijaPredmeta;
	}

	public LocalDateTime getVremePocetka() {
		return vremePocetka;
	}

	public void setVremePocetka(LocalDateTime vremePocetka) {
		this.vremePocetka = vremePocetka;
	}

	public LocalDateTime getVremeKraja() {
		return vremeKraja;
	}

	public void setVremeKraja(LocalDateTime vremeKraja) {
		this.vremeKraja = vremeKraja;
	}

	public String getMestoOdrzavanja() {
		return mestoOdrzavanja;
	}

	public void setMestoOdrzavanja(String mestoOdrzavanja) {
		this.mestoOdrzavanja = mestoOdrzavanja;
	}

	public Ishod getIshod() {
		return ishod;
	}

	public void setIshod(Ishod ishod) {
		this.ishod = ishod;
	}

	public TipNastave getTipNastave() {
		return tipNastave;
	}

	public void setTipNastave(TipNastave tipNastave) {
		this.tipNastave = tipNastave;
	}
}
