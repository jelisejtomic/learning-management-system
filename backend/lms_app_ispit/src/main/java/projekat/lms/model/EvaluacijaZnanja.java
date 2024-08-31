package projekat.lms.model;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class EvaluacijaZnanja extends BaseEntity {
	@Column(nullable = false)
	private LocalDateTime vremePocetka;

	@Column(nullable = false)
	private LocalDateTime vremeKraja;

	@Column(nullable = false)
	private String mestoOdrzavanja;

	@Column(columnDefinition = "Integer default 51")
	private Integer minBodovi;

	@Column(columnDefinition = "Integer default 100")
	private Integer maxBodovi;

	@ManyToOne(optional = false)
	private TipEvaluacije tipEvaluacije;

	@OneToMany(mappedBy = "evaluacijaZnanja")
	private Set<Polaganje> polaganja;

	@OneToOne(optional = false, cascade = CascadeType.REMOVE)
	private Ishod ishod;

	@ManyToOne(optional = false)
	private InstrumentEvaluacije instrumentEvaluacije;

	public EvaluacijaZnanja(Long id, Boolean deleted, LocalDateTime vremePocetka, LocalDateTime vremeKraja,
			String mestoOdrzavanja, Integer minBodovi, Integer maxBodovi, TipEvaluacije tipEvaluacije,
			Set<Polaganje> polaganja, Ishod ishod, InstrumentEvaluacije instrumentEvaluacije) {
		super(id, deleted);
		this.vremePocetka = vremePocetka;
		this.vremeKraja = vremeKraja;
		this.mestoOdrzavanja = mestoOdrzavanja;
		this.minBodovi = minBodovi;
		this.maxBodovi = maxBodovi;
		this.tipEvaluacije = tipEvaluacije;
		this.polaganja = polaganja;
		this.ishod = ishod;
		this.instrumentEvaluacije = instrumentEvaluacije;
	}

	public EvaluacijaZnanja() {
		super();
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

	public Integer getMinBodovi() {
		return minBodovi;
	}

	public void setMinBodovi(Integer minBodovi) {
		this.minBodovi = minBodovi;
	}

	public Integer getMaxBodovi() {
		return maxBodovi;
	}

	public void setMaxBodovi(Integer maxBodovi) {
		this.maxBodovi = maxBodovi;
	}

	public TipEvaluacije getTipEvaluacije() {
		return tipEvaluacije;
	}

	public void setTipEvaluacije(TipEvaluacije tipEvaluacije) {
		this.tipEvaluacije = tipEvaluacije;
	}

	public Set<Polaganje> getPolaganja() {
		return polaganja;
	}

	public void setPolaganja(Set<Polaganje> polaganja) {
		this.polaganja = polaganja;
	}

	public Ishod getIshod() {
		return ishod;
	}

	public void setIshod(Ishod ishod) {
		this.ishod = ishod;
	}

}
