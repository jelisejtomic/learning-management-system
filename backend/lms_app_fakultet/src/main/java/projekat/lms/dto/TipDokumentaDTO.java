package projekat.lms.dto;

import java.io.Serializable;

import projekat.lms.generics.BaseDTO;

public class TipDokumentaDTO extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 4500455139246379424L;
	
	private String naziv;
	
	


	public TipDokumentaDTO(Long id, Boolean deleted, String naziv) {
		super(id, deleted);
		this.naziv = naziv;
	}

	public TipDokumentaDTO() {
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
