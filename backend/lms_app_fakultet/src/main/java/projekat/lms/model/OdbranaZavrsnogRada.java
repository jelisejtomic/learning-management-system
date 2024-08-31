package projekat.lms.model;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import projekat.lms.generics.BaseEntity;

@Entity
public class OdbranaZavrsnogRada extends BaseEntity{
	@Column(nullable = false)
	private LocalDateTime vremePocetka;
	
	@Column(nullable = false)
	private LocalDateTime vremeKraja;
	
	@Column(nullable = false)
	private String mestoOdrzavanja;
	
	@Column(columnDefinition="Integer default 51")
	private Integer minBodovi;
	
	@Column(columnDefinition="Integer default 100")
	private Integer maxBodovi;
	
	private Integer ostvareniBodovi;
	
	@OneToOne(optional = false)
	private ZavrsniRad zavrsniRad;

	

	public OdbranaZavrsnogRada(Long id, Boolean deleted, LocalDateTime vremePocetka, LocalDateTime vremeKraja,
			String mestoOdrzavanja, Integer minBodovi, Integer maxBodovi, Integer ostvareniBodovi,
			ZavrsniRad zavrsniRad) {
		super(id, deleted);
		this.vremePocetka = vremePocetka;
		this.vremeKraja = vremeKraja;
		this.mestoOdrzavanja = mestoOdrzavanja;
		this.minBodovi = minBodovi;
		this.maxBodovi = maxBodovi;
		this.ostvareniBodovi = ostvareniBodovi;
		this.zavrsniRad = zavrsniRad;
	}

	public OdbranaZavrsnogRada() {
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

	public Integer getOstvareniBodovi() {
		return ostvareniBodovi;
	}

	public void setOstvareniBodovi(Integer ostvareniBodovi) {
		this.ostvareniBodovi = ostvareniBodovi;
	}

	public ZavrsniRad getZavrsniRad() {
		return zavrsniRad;
	}

	public void setZavrsniRad(ZavrsniRad zavrsniRad) {
		this.zavrsniRad = zavrsniRad;
	}
}
