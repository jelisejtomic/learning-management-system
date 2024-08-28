package projekat.lms.dto;

import java.io.Serializable;


public class TipNastaveDTO implements Serializable{
	private static final long serialVersionUID = 3460006282498418304L;
	private Long id;
	
	private String naziv;
	private String opis;
	
	
	public TipNastaveDTO(Long id, String naziv, String opis) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.opis = opis;
	}
	
	public TipNastaveDTO() {
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
