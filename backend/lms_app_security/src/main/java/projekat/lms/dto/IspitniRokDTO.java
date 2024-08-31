package projekat.lms.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import projekat.lms.generics.BaseDTO;

public class IspitniRokDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = -2429780582108903691L;
	private String naziv;
	private LocalDateTime pocetakRoka;
	private LocalDateTime krajRoka;

	public IspitniRokDTO() {
		super();
	}

	public IspitniRokDTO(Long id, Boolean deleted, String naziv, LocalDateTime pocetakRoka, LocalDateTime krajRoka) {
		super(id, deleted);
		this.naziv = naziv;
		this.pocetakRoka = pocetakRoka;
		this.krajRoka = krajRoka;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public LocalDateTime getPocetakRoka() {
		return pocetakRoka;
	}

	public void setPocetakRoka(LocalDateTime pocetakRoka) {
		this.pocetakRoka = pocetakRoka;
	}

	public LocalDateTime getKrajRoka() {
		return krajRoka;
	}

	public void setKrajRoka(LocalDateTime krajRoka) {
		this.krajRoka = krajRoka;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
