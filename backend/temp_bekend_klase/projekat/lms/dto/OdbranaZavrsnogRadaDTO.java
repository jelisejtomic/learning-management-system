package projekat.lms.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OdbranaZavrsnogRadaDTO extends BaseDTO implements Serializable{
	private static final long serialVersionUID = -180025944575860834L;
	private Long id;
	
	private LocalDateTime vremePocetka;
	private LocalDateTime vremeKraja;
	private String mestoOdrzavanja;
	
	private Integer minBodovi;
	private Integer maxBodovi;
	private Integer ostvareniBodovi;
	
	private ZavrsniRadDTO zavrsniRad;
	

	public OdbranaZavrsnogRadaDTO(Long id, LocalDateTime vremePocetka, LocalDateTime vremeKraja, String mestoOdrzavanja,
			Integer minBodovi, Integer maxBodovi, Integer ostvareniBodovi, ZavrsniRadDTO zavrsniRad) {
		super();
		this.id = id;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
