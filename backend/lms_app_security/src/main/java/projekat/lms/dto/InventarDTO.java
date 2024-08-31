package projekat.lms.dto;

import java.io.Serializable;

import projekat.lms.generics.BaseDTO;

public class InventarDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = -4536364983632759397L;
	private String naziv;
	private String opis;
	private Integer stanje;

	public InventarDTO() {
		super();
	}

	public InventarDTO(Long id, Boolean deleted, String naziv, String opis, Integer stanje) {
		super(id, deleted);
		this.naziv = naziv;
		this.opis = opis;
		this.stanje = stanje;
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

	public Integer getStanje() {
		return stanje;
	}

	public void setStanje(Integer stanje) {
		this.stanje = stanje;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
