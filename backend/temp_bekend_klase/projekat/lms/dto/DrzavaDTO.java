package projekat.lms.dto;

import java.util.Set;

public class DrzavaDTO {
	private Long id;
	private String naziv;
	
	private Set<MestoDTO> mesta;
	
	
	public DrzavaDTO() {
		super();
	}
	
	public DrzavaDTO(Long id, String naziv, Set<MestoDTO> mesta) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.mesta = mesta;
	}

	public Set<MestoDTO> getMesta() {
		return mesta;
	}

	public void setMesta(Set<MestoDTO> mesta) {
		this.mesta = mesta;
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
	
	
}
