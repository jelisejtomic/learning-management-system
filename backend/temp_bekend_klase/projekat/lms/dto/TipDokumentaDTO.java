package projekat.lms.dto;

import java.io.Serializable;

public class TipDokumentaDTO implements Serializable{
	private static final long serialVersionUID = 4500455139246379424L;
	private Long id;
	
	private String naziv;
	
	

	public TipDokumentaDTO(Long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
	}

	public TipDokumentaDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
