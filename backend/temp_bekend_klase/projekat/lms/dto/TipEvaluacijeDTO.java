package projekat.lms.dto;

import java.io.Serializable;

public class TipEvaluacijeDTO implements Serializable{
	private static final long serialVersionUID = 7139815824814026698L;
	private Long id;
	
	private String naziv;

	
	
	public TipEvaluacijeDTO(Long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
	}

	public TipEvaluacijeDTO() {
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
