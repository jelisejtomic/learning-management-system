package projekat.lms.dto;

import java.io.Serializable;

import projekat.lms.generics.BaseDTO;

public class AdresaDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 1480662552111659681L;
	private String ulica;
	private String broj;
	private MestoDTO mesto;

	public AdresaDTO(Long id, Boolean deleted, String ulica, String broj, MestoDTO mesto) {
		super(id, deleted);
		this.ulica = ulica;
		this.broj = broj;
		this.mesto = mesto;
	}

	public AdresaDTO() {
		super();
	}

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public MestoDTO getMesto() {
		return mesto;
	}

	public void setMesto(MestoDTO mesto) {
		this.mesto = mesto;
	}

}
