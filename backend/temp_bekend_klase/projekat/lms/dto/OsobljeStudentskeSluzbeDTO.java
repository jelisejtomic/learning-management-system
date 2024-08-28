package projekat.lms.dto;

import java.util.Set;

public class OsobljeStudentskeSluzbeDTO{
	private String biografija;
	private Set<InventarDTO> inventar;
	private Set<UdzbenikDTO> biblioteka;
	public OsobljeStudentskeSluzbeDTO() {
		super();
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
	
}
