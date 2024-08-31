package projekat.lms.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import projekat.lms.generics.BaseDTO;

public class OdbranaZavrsnogRadaDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = -180025944575860834L;
	private LocalDateTime vremePocetka;
	private LocalDateTime vremeKraja;
	private String mestoOdrzavanja;
	private Integer minBodovi;
	private Integer maxBodovi;
	private Integer ostvareniBodovi;
	private ZavrsniRadDTO zavrsniRad;

	public OdbranaZavrsnogRadaDTO(Long id, Boolean deleted, Long id2, LocalDateTime vremePocetka,
			LocalDateTime vremeKraja, String mestoOdrzavanja, Integer minBodovi, Integer maxBodovi,
			Integer ostvareniBodovi, ZavrsniRadDTO zavrsniRad) {
		super(id, deleted);
		id = id2;
		this.vremePocetka = vremePocetka;
		this.vremeKraja = vremeKraja;
		this.mestoOdrzavanja = mestoOdrzavanja;
		this.minBodovi = minBodovi;
		this.maxBodovi = maxBodovi;
		this.ostvareniBodovi = ostvareniBodovi;
		this.zavrsniRad = zavrsniRad;
	}

	public OdbranaZavrsnogRadaDTO() {
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

	public ZavrsniRadDTO getZavrsniRad() {
		return zavrsniRad;
	}

	public void setZavrsniRad(ZavrsniRadDTO zavrsniRad) {
		this.zavrsniRad = zavrsniRad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
