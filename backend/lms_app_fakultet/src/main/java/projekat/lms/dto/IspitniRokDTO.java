package projekat.lms.dto;

import java.io.Serializable;
import java.time.LocalDate;

import projekat.lms.generics.BaseDTO;

public class IspitniRokDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = -2429780582108903691L;
	private String naziv;
	private LocalDate pocetakRoka;
	private LocalDate krajRoka;

	public IspitniRokDTO() {
		super();
	}

	public IspitniRokDTO(Long id, Boolean deleted, String naziv, LocalDate pocetakRoka, LocalDate krajRoka) {
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

	public LocalDate getPocetakRoka() {
		return pocetakRoka;
	}

	public void setPocetakRoka(LocalDate pocetakRoka) {
		this.pocetakRoka = pocetakRoka;
	}

	public LocalDate getKrajRoka() {
		return krajRoka;
	}

	public void setKrajRoka(LocalDate krajRoka) {
		this.krajRoka = krajRoka;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
