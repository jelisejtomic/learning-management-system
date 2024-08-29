package projekat.lms.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

public class EvaluacijaZnanjaDTO extends BaseDTO implements Serializable{
	private static final long serialVersionUID = -2283502693035968042L;
	private Long id;
	
	private LocalDateTime vremePocetka;
	private LocalDateTime vremeKraja;
	private String mestoOdrzavanja;
	private Integer minBodovi;
	private Integer maxBodovi;
	private TipEvaluacijeDTO tipEvaluacije;
	private Set<PolaganjeDTO> polaganja;
	private IshodDTO ishod;
	private InstrumentEvaluacijeDTO instrumentEvaluacije;
	
	public EvaluacijaZnanjaDTO(Long id, LocalDateTime vremePocetka, LocalDateTime vremeKraja, String mestoOdrzavanja,
			Integer minBodovi, Integer maxBodovi, TipEvaluacijeDTO tipEvaluacije, Set<PolaganjeDTO> polaganja,
			IshodDTO ishod, InstrumentEvaluacijeDTO instrumentEvaluacije) {
		super();
		this.id = id;
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
	
	public EvaluacijaZnanjaDTO() {
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
	public TipEvaluacijeDTO getTipEvaluacije() {
		return tipEvaluacije;
	}
	public void setTipEvaluacije(TipEvaluacijeDTO tipEvaluacije) {
		this.tipEvaluacije = tipEvaluacije;
	}
	public Set<PolaganjeDTO> getPolaganja() {
		return polaganja;
	}
	public void setPolaganja(Set<PolaganjeDTO> polaganja) {
		this.polaganja = polaganja;
	}
	public IshodDTO getIshod() {
		return ishod;
	}
	public void setIshod(IshodDTO ishod) {
		this.ishod = ishod;
	}
	public InstrumentEvaluacijeDTO getInstrumentEvaluacije() {
		return instrumentEvaluacije;
	}
	public void setInstrumentEvaluacije(InstrumentEvaluacijeDTO instrumentEvaluacije) {
		this.instrumentEvaluacije = instrumentEvaluacije;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
