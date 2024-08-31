package projekat.lms.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import projekat.lms.generics.BaseDTO;

public class IshodDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 2196452011931993494L;
	private String opis;
	private Set<ObrazovniCiljDTO> obrazovniCiljevi = new HashSet<>();
	private Set<NastavniMaterijalDTO> nastavniMaterijal = new HashSet<>();

	public IshodDTO() {
		super();
	}

	public IshodDTO(Long id, Boolean deleted, Long id2, String opis, Set<ObrazovniCiljDTO> obrazovniCiljevi,
			Set<NastavniMaterijalDTO> nastavniMaterijal) {
		super(id, deleted);
		id = id2;
		this.opis = opis;
		this.obrazovniCiljevi = obrazovniCiljevi;
		this.nastavniMaterijal = nastavniMaterijal;
	}

	public Set<ObrazovniCiljDTO> getObrazovniCiljevi() {
		return obrazovniCiljevi;
	}

	public void setObrazovniCiljevi(Set<ObrazovniCiljDTO> obrazovniCiljevi) {
		this.obrazovniCiljevi = obrazovniCiljevi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Set<NastavniMaterijalDTO> getNastavniMaterijal() {
		return nastavniMaterijal;
	}

	public void setNastavniMaterijal(Set<NastavniMaterijalDTO> nastavniMaterijal) {
		this.nastavniMaterijal = nastavniMaterijal;
	}

}
