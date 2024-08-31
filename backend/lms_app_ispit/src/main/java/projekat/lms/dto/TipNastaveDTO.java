package projekat.lms.dto;

import java.io.Serializable;

import projekat.lms.generics.BaseDTO;

public class TipNastaveDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 3460006282498418304L;
	private String naziv;
	private String opis;

	public TipNastaveDTO(Long id, Boolean deleted, String naziv, String opis) {
		super(id, deleted);
		this.naziv = naziv;
		this.opis = opis;
	}

	public TipNastaveDTO() {
		super();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
