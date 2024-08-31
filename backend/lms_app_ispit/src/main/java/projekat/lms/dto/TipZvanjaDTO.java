package projekat.lms.dto;

import java.io.Serializable;

import projekat.lms.generics.BaseDTO;

public class TipZvanjaDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 8750628979351199203L;
	private String naziv;

	public TipZvanjaDTO() {
		super();
	}

	public TipZvanjaDTO(Long id, Boolean deleted, String naziv) {
		super(id, deleted);
		this.naziv = naziv;
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

}
