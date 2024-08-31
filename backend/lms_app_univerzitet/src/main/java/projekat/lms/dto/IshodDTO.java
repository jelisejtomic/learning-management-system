package projekat.lms.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import projekat.lms.generics.BaseDTO;

public class IshodDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 2196452011931993494L;
	private String opis;
	private Set<ObrazovniCiljDTO> obrazovniCiljevi = new HashSet<>();
	private Set<NastavniMaterijalDTO> nastavniMaterijali = new HashSet<>();
	
	public IshodDTO() {
		super();
	}
	
	public IshodDTO(Long id, Boolean deleted, String opis, Set<ObrazovniCiljDTO> obrazovniCiljevi,
			Set<NastavniMaterijalDTO> nastavniMaterijali) {
		super(id, deleted);
		this.opis = opis;
		this.obrazovniCiljevi = obrazovniCiljevi;
		this.nastavniMaterijali = nastavniMaterijali;
	}
	
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public Set<ObrazovniCiljDTO> getObrazovniCiljevi() {
		return obrazovniCiljevi;
	}
	public void setObrazovniCiljevi(Set<ObrazovniCiljDTO> obrazovniCiljevi) {
		this.obrazovniCiljevi = obrazovniCiljevi;
	}
	public Set<NastavniMaterijalDTO> getNastavniMaterijal() {
		return nastavniMaterijali;
	}
	public void setNastavniMaterijal(Set<NastavniMaterijalDTO> nastavniMaterijali) {
		this.nastavniMaterijali = nastavniMaterijali;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
