package projekat.lms.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

public class TerminNastaveDTO implements Serializable{
	private static final long serialVersionUID = -4404900526680285447L;
	private Long id;
	
	private LocalDateTime vremePocetka;
	private LocalDateTime vremeKraja;
	private String mestoOdrzavanja;
	
	private IshodDTO ishod;
	private RealizacijaPredmetaDTO realizacijaPredmeta;
	private TipNastaveDTO tipNastave;
	

	public TerminNastaveDTO() {
		super();
	}
	
	public TerminNastaveDTO(Long id, LocalDateTime vremePocetka, LocalDateTime vremeKraja, String mestoOdrzavanja,
			IshodDTO ishod, RealizacijaPredmetaDTO realizacijaPredmeta, TipNastaveDTO tipNastave) {
		super();
		this.id = id;
		this.vremePocetka = vremePocetka;
		this.vremeKraja = vremeKraja;
		this.mestoOdrzavanja = mestoOdrzavanja;
		this.ishod = ishod;
		this.realizacijaPredmeta = realizacijaPredmeta;
		this.tipNastave = tipNastave;
	}

	public RealizacijaPredmetaDTO getRealizacijaPredmeta() {
		return realizacijaPredmeta;
	}

	public void setRealizacijaPredmeta(RealizacijaPredmetaDTO realizacijaPredmeta) {
		this.realizacijaPredmeta = realizacijaPredmeta;
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

	public IshodDTO getIshod() {
		return ishod;
	}

	public void setIshod(IshodDTO ishod) {
		this.ishod = ishod;
	}

	public TipNastaveDTO getTipNastave() {
		return tipNastave;
	}

	public void setTipNastave(TipNastaveDTO tipNastave) {
		this.tipNastave = tipNastave;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
