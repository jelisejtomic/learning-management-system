package projekat.lms.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class IshodDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 2196452011931993494L;
	private Long id;
	private String opis;
	private Set<ObrazovniCiljDTO> obrazovniCiljevi = new HashSet<>();
	private Set<NastavniMaterijalDTO> nastavniMaterijal = new HashSet<>();

	public IshodDTO() {
		super();
	}

	public IshodDTO(Long id, String opis, Set<ObrazovniCiljDTO> obrazovniCiljevi,
			Set<NastavniMaterijalDTO> nastavniMaterijal) {
		super();
		this.id = id;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
