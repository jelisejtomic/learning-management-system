package projekat.lms.dto;

import java.io.Serializable;

import projekat.lms.generics.BaseDTO;

public class UlogaDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 8797489694856711063L;
	private String naziv;

	public UlogaDTO() {
		super();
	}

	public UlogaDTO(Long id, Boolean deleted, String naziv) {
		super(id, deleted);
		this.naziv = naziv;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
