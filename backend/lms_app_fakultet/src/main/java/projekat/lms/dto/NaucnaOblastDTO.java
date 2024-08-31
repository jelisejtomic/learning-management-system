package projekat.lms.dto;

import java.io.Serializable;

import projekat.lms.generics.BaseDTO;

public class NaucnaOblastDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 4490604472890814876L;
	private String naziv;

	public NaucnaOblastDTO() {
		super();
	}

	public NaucnaOblastDTO(Long id, Boolean deleted, String naziv) {
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
