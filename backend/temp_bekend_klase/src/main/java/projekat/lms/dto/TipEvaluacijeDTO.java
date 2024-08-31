package projekat.lms.dto;

import java.io.Serializable;

import projekat.lms.generics.BaseDTO;

public class TipEvaluacijeDTO extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 7139815824814026698L;

	private String naziv;

	
	public TipEvaluacijeDTO(Long id, Boolean deleted, String naziv) {
		super(id, deleted);
		this.naziv = naziv;
	}

	public TipEvaluacijeDTO() {
		super();
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
