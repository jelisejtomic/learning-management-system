package projekat.lms.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class InstrumentEvaluacijeDTO extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 8797489694856711063L;
	private Long id;
	
	private Set<FajlDTO> fajlovi = new HashSet<>();

	public InstrumentEvaluacijeDTO() {
		super();
	}
	
	public InstrumentEvaluacijeDTO(Long id, Set<FajlDTO> fajlovi) {
		super();
		this.id = id;
		this.fajlovi = fajlovi;
	}

	public Set<FajlDTO> getFajlovi() {
		return fajlovi;
	}

	public void setFajlovi(Set<FajlDTO> fajlovi) {
		this.fajlovi = fajlovi;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
