package projekat.lms.dto;

import java.io.Serializable;
import java.util.Set;

import projekat.lms.generics.BaseDTO;

public class InstrumentEvaluacijeDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 8797489694856711063L;
	private Set<FajlDTO> fajlovi;

	public InstrumentEvaluacijeDTO() {
		super();
	}

	public InstrumentEvaluacijeDTO(Long id, Boolean deleted, Set<FajlDTO> fajlovi) {
		super(id, deleted);
		this.fajlovi = fajlovi;
	}

	public Set<FajlDTO> getFajlovi() {
		return fajlovi;
	}

	public void setFajlovi(Set<FajlDTO> fajlovi) {
		this.fajlovi = fajlovi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
