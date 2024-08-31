package projekat.lms.dto;

import java.io.Serializable;
import java.util.Set;

import projekat.lms.generics.BaseDTO;

public class OsobljeStudentskeSluzbeDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 4536364983632759397L;
	private String biografija;
	private Set<InventarDTO> inventar;
	private Set<UdzbenikDTO> biblioteka;
	public OsobljeStudentskeSluzbeDTO() {
		super();
	}
	
	public OsobljeStudentskeSluzbeDTO(Long id, Boolean deleted, String biografija, Set<InventarDTO> inventar,
			Set<UdzbenikDTO> biblioteka) {
		super(id, deleted);
		this.biografija = biografija;
		this.inventar = inventar;
		this.biblioteka = biblioteka;
	}

	public String getBiografija() {
		return biografija;
	}
	public void setBiografija(String biografija) {
		this.biografija = biografija;
	}
	public Set<InventarDTO> getInventar() {
		return inventar;
	}
	public void setInventar(Set<InventarDTO> inventar) {
		this.inventar = inventar;
	}
	public Set<UdzbenikDTO> getBiblioteka() {
		return biblioteka;
	}
	public void setBiblioteka(Set<UdzbenikDTO> biblioteka) {
		this.biblioteka = biblioteka;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
