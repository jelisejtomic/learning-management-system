package projekat.lms.dto;

import java.io.Serializable;

import projekat.lms.generics.BaseDTO;

public class MestoDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 3460006282498418304L;
	private String naziv;
	private DrzavaDTO drzava;

	public MestoDTO() {
		super();
	}

	public MestoDTO(Long id, Boolean deleted, String naziv, DrzavaDTO drzava) {
		super(id, deleted);
		this.naziv = naziv;
		this.drzava = drzava;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public DrzavaDTO getDrzava() {
		return drzava;
	}

	public void setDrzava(DrzavaDTO drzava) {
		this.drzava = drzava;
	}

}
