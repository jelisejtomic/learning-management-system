package projekat.lms.dto;

import java.io.Serializable;
import java.util.Set;

import projekat.lms.generics.BaseDTO;

public class DrzavaDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 180025944575860834L;
	private String naziv;
	private Set<MestoDTO> mesta;

	public DrzavaDTO() {
		super();
	}

	public DrzavaDTO(Long id, Boolean deleted, String naziv, Set<MestoDTO> mesta) {
		super(id, deleted);
		this.naziv = naziv;
		this.mesta = mesta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Set<MestoDTO> getMesta() {
		return mesta;
	}

	public void setMesta(Set<MestoDTO> mesta) {
		this.mesta = mesta;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

}
